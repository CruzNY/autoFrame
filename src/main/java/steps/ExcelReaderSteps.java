package steps;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Alex
 *
 */
/**
 * @author Alex
 *
 */
public class ExcelReaderSteps{
	public File file;
	public ExcelReaderSteps(){
		file = new File("C:\\Users\\Alex\\Downloads\\dataSheets(3).xlsx");
	}
//	// Read excel file
//	public void readExcel() throws IOException {
//		try {
//			File file = new File("C:\\Users\\Alex\\Downloads\\Customer.xlsx");
//			FileInputStream fileInput = new FileInputStream(file);
//			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
//			XSSFSheet sheet = workbook.getSheetAt(0);
//			Iterator<Row> iterator = sheet.iterator();
//			while (iterator.hasNext()) {
//				Row row = iterator.next();
//				Iterator<Cell> cellIterator = row.cellIterator();
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					System.out.print(cell.getStringCellValue() + "\t\t\t");
//				}
//				System.out.println();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}		
//	}
//	public void readXL() throws IOException{
//		ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
//		try {
//			File file = new File("C:\\Users\\Alex\\Downloads\\Customer.xlsx");
//			FileInputStream fileInput = new FileInputStream(file);
//			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
//			XSSFSheet sheet = workbook.getSheetAt(0);
//			Iterator<Row> iterator = sheet.iterator();
//			int rowint = 0;
//			int columnint = 0;
//			while (iterator.hasNext()) {
//				rowint++;
//				Row row = iterator.next();
//				Iterator<Cell> cellIterator = row.cellIterator();
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					System.out.print(cell.getStringCellValue() + "\t\t\t");
////					first row will contains the header columns and that establishes the amount of columns needed
//					if(rowint<=1)
//						columnint++;
//				}
//				System.out.println();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}				
//	}
//	
//	
//	
//	public static Map<String, Map<String, String>> excelMapFile() throws IOException{
//		File file = new File("C:\\Users\\Alex\\Downloads\\Customer(1).xlsx");
//		FileInputStream fileInput = new FileInputStream(file);
//		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		workbook.close();
//		
//		Map<String, Map<String, String>> excelMap = new HashMap<String, Map<String, String>>();
//		Map<String, String> map = new HashMap<String, String>();
//		XSSFRow row; 
//		for(int i = 1; i<sheet.getLastRowNum() +1; i++) {
//			row = sheet.getRow(1);
//			String keyCell = row.getCell(0).getStringCellValue();
//			int columns = row.getLastCellNum();
//			for(int j = 1; j<columns; j++) {
//				String value = row.getCell(j).getStringCellValue();
//				map.put(value, keyCell);
//			}
//			excelMap.put("megamap", map);
//		}		
//		return excelMap;
//	}
//	public static String getValue(String key) throws IOException {
//		Map<String, String> myVal = excelMapFile().get("megamap");
//		String rs = myVal.get(1);
//		return rs;
//	}
//	public void pMap() throws IOException {
//		Map<String, String> myVal = excelMapFile().get("megamap");
//		System.out.println(myVal.keySet().toString());
//		Stream.of(myVal.keySet().toString()).forEach(System.out::println);
//	}
	
	
	public HashMap loadExcelLines(File filename) throws IOException {
		HashMap<String,LinkedHashMap<Integer, List>> outerMap = new HashMap<String,LinkedHashMap<Integer, List>>();
		LinkedHashMap<Integer, List> hashMap = new LinkedHashMap<Integer, List>();
		
		String sheetName = null;
		List sheetData = new ArrayList();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(filename);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			for(int i = 0; i<workBook.getNumberOfSheets(); i++) {
				XSSFSheet sheet = workBook.getSheetAt(i);
				sheetName = workBook.getSheetName(i);
				
				Iterator rows = sheet.rowIterator();
				while(rows.hasNext()) {
					XSSFRow row = (XSSFRow)rows.next();
					Iterator cells = row.cellIterator();
					List data = new LinkedList();
					while(cells.hasNext()) {
						XSSFCell cell = (XSSFCell)cells.next();
						cell.setCellType(Cell.CELL_TYPE_STRING);
						data.add(cell); 
					}
					hashMap.put(row.getRowNum(), data);  // Integer and List
				}
				outerMap.put(sheetName, hashMap); //String and HashLinkedMap
				hashMap = new LinkedHashMap<Integer, List>();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}	
			}
		}
		return outerMap;
	}

	/**
	 * @param map
	 * reads values stored in workbook sheets. 
	 */
	public void getMapSheet1(HashMap map, String sheetNum) {
		System.out.println(((List)((Map)map.get("newCustomer")).get(1)).get(1)); //row then column 1:1
//		System.out.println(map.get(sheetNum));
//		System.out.println(((Map)map.get(sheetNum)));
	}
	
	public LinkedHashMap getMapSheet(HashMap map, String sheetName) {
		return (LinkedHashMap) map.get(sheetName);
	}
	
	
	
	
	
	
}
