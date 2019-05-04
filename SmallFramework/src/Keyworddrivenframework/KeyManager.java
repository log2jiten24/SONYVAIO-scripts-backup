package Keyworddrivenframework;

import java.io.IOException;
import Functionlibrary.*;
//import broswer.Differentbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyManager {

	
	
	public void Execute() throws IOException, Exception {
		System.out.println("KeyManager Start");

	   System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();

		System.out.println("WebDriverWrapper Creating.");
		
		WebDriverWrapper wrapper = new WebDriverWrapper(driver);
		System.out.println("WebDriverWrapper Created");

		System.out.println("File Reading");
		DataLayer dl = new DataLayer();
		 
		//Create two dimensional array to store the values of rows and columns 
		Object[][] excelData = dl.ReadExcel("D:\\Excel_Data_01.xlsx", "Sheet3", 3);
		System.out.println("File Read");
       
	//excelData is the two dimensional array where we are storing rows and columns
   // r is the row  
		
		for (int r = 0; r < excelData.length; r++) {
            //first row first column - it will iterate the whole first column of whole row 
			String command = (String) excelData[r][0];
			//first row second column - it will iterate the whole second column of whole row
			String xpathTraget = (String) excelData[r][1];
			//first row third column - it will iterate the whole third column of whole row
			String value = (String) excelData[r][2];
            
			System.out.println(command + "\t" + xpathTraget + "\t" + value);
			
			if (command.equalsIgnoreCase("Open")) {
				System.out.println("Open command Executing");
				//open the url 
				wrapper.Open(xpathTraget);
				//Get the title of the homepage
				WebDriverWrapper.getTitle();
				System.out.println("Home Page title" + WebDriverWrapper.getTitle());
			}
			
			//to enter username
			if(command.equalsIgnoreCase("typeUserName")){
			//to enter the username 
			 WebDriverWrapper.type(xpathTraget, value);
			}
			
		   //to enter Password	
		  if (command.equalsIgnoreCase("typePassword")) {
			  
			WebDriverWrapper.typePassword(xpathTraget, value);
			
			//wait for 10 seconds
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//to take the screenshot of login page 
			ExcelFunctionlib.takeScreenshot(driver, "c://login.jpg");
			
			}
		  
		  if (command.equalsIgnoreCase("click")){
			  
              //to click on Submit button  
				wrapper.click(xpathTraget);
					
				//to take the screenshot of home page login
				ExcelFunctionlib.takeScreenshot(driver, "c://homepage.jpg");	
			}

		}

		System.out.println("KeyManager End");
	}

}
