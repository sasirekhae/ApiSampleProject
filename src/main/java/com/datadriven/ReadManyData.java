package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadManyData {               //Read more no.of data from excel program 
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Nayanika\\Desktop\\Maven\\DataDriven.xlsx");
	FileInputStream	fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet s=w.getSheetAt(0);
    int physicalNumberOfRows = s.getPhysicalNumberOfRows();
    for (int i=0;i<physicalNumberOfRows;i++) {
		Row row=s.getRow(i);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();		
		for (int j = 0; j < physicalNumberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType ct=cell.getCellType();
			if (ct.equals(ct.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			} else if (ct.equals(ct.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int intvalue=(int)numericCellValue;
				System.out.println(intvalue);
	
		}
		
	}
    
    	
	
	}

		
	}
	
	
	
	
}

