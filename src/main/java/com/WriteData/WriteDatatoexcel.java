package com.WriteData;  //Writting data to excel from coding

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.output.DeferredFileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatatoexcel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Nayanika\\Desktop\\Maven\\DataDriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		w.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("nayanika@gmail.com");
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("78898777");
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		
		
	}

}
