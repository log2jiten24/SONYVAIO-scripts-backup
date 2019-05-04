package Frameworkcreation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exampleexcelretrieve {

	public String getData (String filepath ,int sheetindex , 
	int rownumber , int columnnumber) throws Exception 
    {
   	 
  FileInputStream fis = new FileInputStream(filepath) ;
  XSSFWorkbook wb = new XSSFWorkbook (fis) ;
  XSSFSheet sh = wb.getSheetAt(sheetindex) ;
  int rowcount = sh.getLastRowNum();
  int colcount = sh.getRow(0).getPhysicalNumberOfCells() ;
  
  System.out.println("number of rowcount :" + rowcount);
  System.out.println("number of colcount :" + colcount);
   	for (int i = 0 ; i < rowcount ; i++) {
   	String datastore = sh.getRow(rownumber).getCell(columnnumber).getStringCellValue() ;
   	return datastore ;
            }
		return filepath;
    }
    
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//to get the value from excel 
		
		String filepath = "C:\\Users\\Jiten\\Desktop\\Practice.xlsx" ; 
		
		Exampleexcelretrieve obj = new Exampleexcelretrieve() ;
		System.out.println("content of each cell :"+ 
		 obj.getData(filepath, 0, 2, 2));
		

	}

}

