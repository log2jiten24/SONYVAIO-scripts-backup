package Functionlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhashtable {

	//method to retrieve the excel row data based on each row 
	
	public  HashMap<String,String> getDatafromExcel (String sheetname , String rowkeyword , String excelpath) 
	{
	HashMap <String , String> hm = new HashMap <String , String> ();
	try {
		FileInputStream fis = new FileInputStream(excelpath);
		try {
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetname) ;
			//to get the number of rows and columns 
			int rowcount = sh.getPhysicalNumberOfRows() ;
			int colcount = sh.getRow(0).getPhysicalNumberOfCells() ;
			
			System.out.println("number of rows :" + rowcount);
			System.out.println("number of columns :" + colcount );
			//form hash map with column name and value
			for (int j = 0 ; j < rowcount ; j ++ )
			{
		if (sh.getRow(j).getCell(0).getStringCellValue().equalsIgnoreCase(rowkeyword)) 	{
			for (int k = 0 ; k < colcount ; k ++)
			{
		hm.put(sh.getRow(0).getCell(k).toString(), sh.getRow(j).getCell(k).getStringCellValue()) ;		
			}
			break ;
		}
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return hm  ;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//to retrieve the value from excel
		String excelpath = "C:\\Users\\Jiten\\Desktop\\Practice.xlsx" ;
		
		Excelhashtable obj = new Excelhashtable() ;
		System.out.println("value retrieved from excel :" + obj.getDatafromExcel("Sheet1", "jity123", excelpath));
		//output :-value retrieved from 
		//excel :{Username=jity123, Password=abc@1234, Name=Jitu}
		
		//to get all the keyset 
		Set<String> exceldetails  = obj.getDatafromExcel("Sheet1", "jity123", excelpath).keySet() ;
		for (String details : exceldetails )
		{
		System.out.println("each key details :" + details);
		}
		//to get all the values from the excel 
		Collection<String> valuedetails  = 
		obj.getDatafromExcel("Sheet1", "jity123", excelpath).values() ;
		
		Iterator <String> itr = valuedetails.iterator() ;
		while (itr.hasNext())
		{
		String valuespresent = itr.next() ;
		System.out.println("each value present :" + valuespresent);
		if (valuespresent.contentEquals("jity123"))
		{
			break ;
		}
		}
		
	}
}
