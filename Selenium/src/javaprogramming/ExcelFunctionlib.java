package javaprogramming;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class ExcelFunctionlib {
	
	String filepath = "D:\\Framework_01.xlsx";
	
	
	XSSFWorkbook wb ;
	XSSFSheet sh1 ;
	FileInputStream fis ;
	//creating constructor to specify the excel path for reading it.
	public  ExcelFunctionlib (String filepath) {
		
     try {
		File src = new File (filepath);
		  fis = new FileInputStream(src);
		  wb = new XSSFWorkbook(src);
		  
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("catched exception is" +e.getMessage());

	}
	   }
	//method to get the sheetname , rownumber, columnnumber from excel sheet 
     @SuppressWarnings("unused")
	public String getData (int sheetname , int rownumber , int columnnumber) 
     {
    	sh1 = wb.getSheetAt(sheetname) ;
    	int rowcount = sh1.getLastRowNum();
    	for (int i = 0 ; i < rowcount ; i++) {
    	String datastore = sh1.getRow(rownumber).getCell(columnnumber).getStringCellValue() ;
    	return datastore ;
             }
		return filepath;
                 } 
	}


