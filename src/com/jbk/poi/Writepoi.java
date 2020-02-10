package com.jbk.poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class Writepoi {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream(new File("Demo2.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet =wb.createSheet();
		sheet.getRow(0).createCell(1).setCellValue("pass");
		sheet.getRow(1).createCell(2).setCellValue("fail");
		sheet.getRow(2).createCell(3).setCellValue("pass");
		
		wb.write(f);
		wb.close();

		}

}
