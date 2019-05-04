package Functionlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class ExcelFunctionlib {
//
//String filepath = "D:\\Framework_01.xlsx";
//
//	XSSFWorkbook wb ;
//	XSSFSheet sh1 ;
//	FileInputStream fis ;
//
//	
//	//creating constructor to specify the excel path for reading it.
//	public  ExcelFunctionlib (String filepath) {
//		
//     try {
//		File src = new File (filepath);
//		  fis = new FileInputStream(src);
//		  wb = new XSSFWorkbook(src);
//		  
//	   } catch (Exception e) {
//		// TODO Auto-generated catch block
//		System.out.println("catched exception is" +e.getMessage());
//
//	}
//	   }
//	//method to get the sheetname , rownumber, columnnumber from excel sheet 
//     @SuppressWarnings("unused")
//	public String getData (int sheetname , int rownumber , int columnnumber) 
//     {
//    	 
//    	sh1 = wb.getSheetAt(sheetname) ;
//    	int rowcount = sh1.getLastRowNum();
//    	int colcount = sh1.getRow(0).getPhysicalNumberOfCells() ;
//    	System.out.println("number of rowcount :" + rowcount);
//    	System.out.println("number of colcount :" + colcount);
//    	for (int i = 0 ; i < rowcount ; i++) {
//    	String datastore = sh1.getRow(rownumber).getCell(columnnumber).getStringCellValue() ;
//    	return datastore ;
//             }
//		return filepath;
//     }
     
     
    // method to take the screenshot and store it in a particular path 
    public static void takeScreenshot (WebDriver driver , String filepath) {
    try {	
    //Convert WebDriver object to takeScreenshot	
    TakesScreenshot scrShot = ((TakesScreenshot)driver);
    //Call getScreenshotAs method to create image file 
    File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
    //move image file to new destination 
    File destfile = new File(filepath);
    //copyfile at destination 
    FileUtils.copyFile(srcFile, destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}	 
       }
    
    
    //to read the value of each row and column of the excel based on the Sheet Name given
    
    
    public String  excel_read_row_col (String path, int index , int rownumber , int cellnumber ) 
    {
        try {
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//to get the particular sheet based on the index
		XSSFSheet sheetname = workbook.getSheetAt(index);
		// to get the value of a particular row 
		XSSFRow row = sheetname.getRow(rownumber);
		// to get the value of a particular cell
		XSSFCell cell = row.getCell(cellnumber);
		//to store the cell object value into a string 
		
		if (cell.getCellTypeEnum() == CellType.STRING) 
			return cell.getStringCellValue() ;
		else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)	{
			String value = String.valueOf(cell.getNumericCellValue()) ;
			
		if (HSSFDateUtil.isCellDateFormatted(cell)) {
			
			DateFormat dt = new SimpleDateFormat("dd/MM/yy");
			Date date =  cell.getDateCellValue() ;
			value  = dt.format(date); 
		}
	    return value ;
		}else if (cell.getCellTypeEnum() == CellType.BLANK ) 
		return " " ;
		else {
			return String.valueOf(cell.getBooleanCellValue());
		}
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        	return "No match value found" ;
        }
        
                  }
        
    
    
    // method to count the number of characters in a string 
      public  int  getcount (String entered , String alphabet ) 
        {
    	
    	char ch = alphabet.charAt(0);
    	int count = 0;
    	
    	for (int i = 0; i<entered.length()-1 ; i++)
    	{
        if (entered.charAt(i) == ch) {
      	count ++;	
        }
          }
        return count ;
                 }
}
