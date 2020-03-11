package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderSteps{

	// Read excel file
	public void readExcel() throws IOException {
		try {
			File file = new File("C:\\Users\\Alex\\Downloads\\Customer.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = sheet.iterator();
			while (iterator.hasNext()) {
				Row row = iterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					System.out.print(cell.getStringCellValue() + "\t\t\t");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	public void readXL() throws IOException{
		ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
		try {
			File file = new File("C:\\Users\\Alex\\Downloads\\Customer.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = sheet.iterator();
			int rowint = 0;
			int columnint = 0;
			while (iterator.hasNext()) {
				rowint++;
				Row row = iterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					System.out.print(cell.getStringCellValue() + "\t\t\t");
//					first row will contains the header columns and that establishes the amount of columns needed
					if(rowint<=1)
						columnint++;
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
//		return null;
		
	}
}
