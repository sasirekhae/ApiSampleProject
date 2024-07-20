package com.datadriven;  //particular data read (taken) from excel program

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.formula.ptg.EqualPtg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticular {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Nayanika\\Desktop\\Maven\\DataDriven.xlsx");
		FileInputStream file1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(file1);
		Sheet s=w.getSheetAt(0);
		Row r=s.getRow(1);
		Cell c=r.getCell(1);
		CellType ct=c.getCellType();
		
		if (ct.equals(ct.STRING)) {
			String stringcellvalue=c.getStringCellValue();
			System.out.println(stringcellvalue);
			
		} else {
			if(ct.equals(ct.NUMERIC));
			double numericcellvalue=c.getNumericCellValue();
			int i=(int)numericcellvalue;
			System.out.println(i);

		}
		
		
		
		
	}

}
