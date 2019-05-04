package FrameworkDesign;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileInputStream;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     
		BufferedReader br = null ;
		String CurrentLine ;
		String[]data = null ;
		br = new BufferedReader(new FileReader ("D:\\Framework_01.xlsx"));
		
		while ((CurrentLine = br.readLine())!= null ) {
			System.out.println("\n" + "Line = \t" +CurrentLine);
			data = CurrentLine.split(",");
			System.out.println("First Column = \t" +data[0]);
			System.out.println("Second Column = \t" +data[1]);
			
			if (data[0].equalsIgnoreCase("Google.com") && data[1].equalsIgnoreCase("Y")) 
                {
				Google.Open_Google_url(); 
				System.out.println("testcase Google passed");
          } else if (data[0].equalsIgnoreCase("Mozilla.exe") && data[1].equalsIgnoreCase("Y")) 
                {
	            Open_HRM.Open_OrangeHRM();
	            System.out.println("testcase OrangeHRM passed");
                        }
		                       	}	
		               }	
	                }


