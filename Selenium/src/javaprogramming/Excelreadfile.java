package javaprogramming;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String filepath = "D:\\Framework_01.xlsx" ;
		//load the file
		FileInputStream fis = new FileInputStream(filepath);
		//to get access to the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//to get access to the sheet  
		//getSheetAt = 0 means it is the first sheet
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		String firstrow = sh1.getRow(0).getCell(0).getStringCellValue() ;
		String seccolumn = sh1.getRow(1).getCell(0).getStringCellValue();
		String secondcol = sh1.getRow(0).getCell(1).getStringCellValue() ;
		System.out.println("data present in the first row is " + "-" + " " +firstrow);
		System.out.println("data present in the second row is " + "-" + " " +seccolumn);
		System.out.println("data present in the second column is " + "-" + " " +secondcol);
		//to close the excel file 
		
		wb.close();
		
		
				
	
	
	}

}
