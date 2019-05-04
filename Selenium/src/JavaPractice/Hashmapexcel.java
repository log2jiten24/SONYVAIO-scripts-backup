package JavaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hashmapexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\Jiten\\Desktop\\Practice.xlsx" ;
		//to create hashmap for storing excel row and column values
		HashMap <String , String> hm = new HashMap <String , String> ();
		try {
			FileInputStream fis = new FileInputStream(filepath) ;
			try {
				XSSFWorkbook wb = new XSSFWorkbook (fis) ;
				XSSFSheet sh = wb.getSheet("Sheet1");
				//to take the rowcount 
				int rowcount = sh.getPhysicalNumberOfRows();
				//to take the columncount
				int colcount = sh.getRow(0).getPhysicalNumberOfCells() ;
				//to print the rowcount and columncount 
				System.out.println("number of rows in an excel :" + rowcount) ;
				System.out.println("Number of cols in an excel :" + colcount);
				
				for (int j = 0 ; j < rowcount ; j++)
				{
				for (int k = 0 ; k <colcount ; k++)
				{
				//to store the values inside the hashmap	
				hm.put(sh.getRow(0).getCell(k).toString(), sh.getRow(j).getCell(k).getStringCellValue());
				//to iterate the values through hashmap
				for (Map.Entry<String, String> allDetails : hm.entrySet())
				{
				System.out.println("content present inside the key :" +" "+ allDetails.getKey()
				+" " + "and " +" " + "content present inside the values :" + " " + allDetails.getValue());	
				}
				
				if (hm.containsValue("Khushi"))
				{
				System.out.println ("retrive khushi from excel :" 
				+ sh.getRow(3).getCell(2).getStringCellValue() );
				}else{
				System.out.println("data not present");	
				}
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
		
		
		
		
		
	}

}
