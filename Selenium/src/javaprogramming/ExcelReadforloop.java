package javaprogramming;

import java.io.File;
import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadforloop {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		// create a object of file class from java.io package where the excel file is created
      File src = new File ("D:\\Framework_01.xlsx");
        // Create Workbook to read the whole excel 
      XSSFWorkbook wb = new XSSFWorkbook(src);
      //now load the sheet name which to read 
      //getSheetAt method it retrieves the first Sheet 
      XSSFSheet sh1 = wb.getSheetAt(0);
      // it will retrieve the total number of rows 
      int rowcount = sh1.getLastRowNum();
      System.out.println("total number of rows is " + rowcount);
      
      //using for loop to iterate the number of rows 
      for(int i = 0 ;i<rowcount; i++)
      {
    	  String rowdata = sh1.getRow(i).getCell(0).getStringCellValue() ;
      System.out.println("the value of each row is " + " - " + rowdata );
      }
      wb.close();
	}

}
