package FrameworkDesign;

import org.testng.annotations.Test;
import Functionlibrary.*;
public class Keyword {
	
  @Test
  public void open_multiple_url () throws Exception {
     String filepath = "D:\\Framework_01.xlsx" ;
	//Create object of the ExcelFunctionlib class to access	
     Exampleexcelretrieve obj = new Exampleexcelretrieve() ;
		//to open Google.com in Chrome Browser 
		if (obj.getData(filepath, 0, 1, 0).equalsIgnoreCase("Google.com")) {
			Google.Open_Google_url();
			System.out.println("testcase Google passed");
		}
		  // to open Orange_HRM url in Mozilla Firefox Browser 
	       if(obj.getData(filepath, 0, 2, 2).equalsIgnoreCase("Mozilla.exe")) 
		{
				Open_HRM.Open_OrangeHRM();
				System.out.println("testcase OrangeHRM passed");
			}
		    
                         }
                   }
	               	  
	  
	  
//(0, 1, 0)
//getData(0, 2, 2)