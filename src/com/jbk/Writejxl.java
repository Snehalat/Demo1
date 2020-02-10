package com.jbk;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Writejxl {
	static WritableWorkbook wb;
	static WritableSheet sheet ;
	public static void main(String[] args) {
		try {

			FileOutputStream f = new FileOutputStream(new File("Demo1.xls"));

			wb = Workbook.createWorkbook(f);
		 sheet=wb.createSheet("Sheet1", 0);
		 
		Label l=new Label(0, 0, "Name");
		sheet.addCell(l);
		
		Label ls=new Label(0,1,"Snehal");
				sheet.addCell(ls);
		
		Label ll=new Label(0,2,"Ashish");
				sheet.addCell(ll);
		
		
		Label l1=new Label(1, 0, "City");
		sheet.addCell(l1);
		
		Label lm=new Label(1, 1, "Pune");
		sheet.addCell(lm);
		
		
		Label lf=new Label(1, 2, "Pune");
		sheet.addCell(lf);
			
		Label l2=new Label(2, 0, "Age");
		sheet.addCell(l2);
		
		Label lj=new Label(2, 1, "28");
		sheet.addCell(lj);
	
		
		Label l3=new Label(3, 0, "State");
		sheet.addCell(l3);
			
			
		wb.write();
		wb.close();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
