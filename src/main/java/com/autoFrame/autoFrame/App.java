package com.autoFrame.autoFrame;



import java.io.File;
import java.io.IOException;

import steps.ExcelReaderSteps;

/**
 * Hello world!
 *
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
//	        System.out.println(System.getProperty("user.dir") + "\\properties\\config.properties");
		ExcelReaderSteps xl = new ExcelReaderSteps();
		File file = new File("C:\\Users\\Alex\\Downloads\\Customer(3).xlsx");
//		System.out.println(xl.getValue("M"));
		System.out.println(xl.excelMapFile());
		
		xl.pMap();
		System.out.println("======================================================");
		System.out.println("\n");
		System.out.println("======================================================");
		System.out.println(xl.loadExcelLines(file));
//		System.out.println(xl.loadExcelLines(file).get("Sheet1"));		
		System.out.println();
//		xl.pMap();
	}
}
