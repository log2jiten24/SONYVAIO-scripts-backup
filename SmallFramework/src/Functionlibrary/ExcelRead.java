/**
 * 
 */
package Functionlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Jiten function to read the data from excel.
 *
 */
public class ExcelRead {
	
	XSSFWorkbook wb ;
	XSSFSheet sh ;
	
	public ExcelRead (String ExcelPath ) {
		
		// to specify the excel path 
		File src = new File(ExcelPath);
		try {
			//Create file InputStream Object 
			FileInputStream fis = new FileInputStream(src);
			// Create Object of the ExcelWorkbook 
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catched exception is " + e.getMessage());
		}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("catched exception is " +e.getMessage());
		}	
	}
	
	// to get the data from Excel for each row and column 
	public String getDatafromExcel (int sheetname , int row , int columnname) {
	
	//Get the sheet name of the Excel 	
	sh = wb.getSheetAt(sheetname);
	
	// to get the specific data from excel for each row and column 
	String data = sh.getRow(row).getCell(columnname).getStringCellValue() ;
	
	return data;
		
	}
  
	// to get the rowcount based on the SheetName  giving input parameter as SheetName 
	public int rownumber (int sheetindex) {
		
		// to get the row number count 
		int rownumber = wb.getSheetAt(sheetindex).getLastRowNum();
		// it will plus one to rowcount as row count starts from zero 
		rownumber = rownumber + 1 ;
		return rownumber ;
		
	}
}





