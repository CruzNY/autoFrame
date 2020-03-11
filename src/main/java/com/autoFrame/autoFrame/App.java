package com.autoFrame.autoFrame;



import java.io.IOException;

import steps.ExcelReaderSteps;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
//	        System.out.println(System.getProperty("user.dir") + "\\properties\\config.properties");
		ExcelReaderSteps xl = new ExcelReaderSteps();
		xl.readXL();
	}
}
