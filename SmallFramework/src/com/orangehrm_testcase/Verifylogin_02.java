/**
 * 
 */
package com.orangehrm_testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import PageObjectModel.Loginpage;
import Functionlibrary.*;

/**
 * @author Jiten
 * test case page where we will be calling methods and it acts as a test case java class 
 */

//@SuppressWarnings("unused")
public class Verifylogin_02 {

public String base_url = "http://opensource.demo.orangehrmlive.com/";
public  WebDriver driver;

// method to open the browser 
@BeforeTest
public void verifyopenbrowser() {
	// to set the gecko driver path to run the Mozilla firefox 
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	//Invoking firefox driver by creating object of the firefox Class 
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	// Open the URL 
	driver.get(base_url);	
	
	// take screenshot of login page
	ExcelFunctionlib.takeScreenshot(driver, "d://login.jpg");
	
	String actual_title = "";
	// get the title of the Orange HRM Home Page 
	actual_title= driver.getTitle();
	String expected_title = "OrangeHRM";
	
   // Compare the expected_title with the actual_title 
	if(actual_title.contentEquals(expected_title)) {
	System.out.println(" title of the OrangeHRM loginpage is passed" + actual_title);
		}
		else{
	System.out.println(" title of the OrangeHRM loginpage is failed");
		}
	//Converting it into TestNG annotations 
	AssertJUnit.assertEquals(expected_title, actual_title);	
    }


@Test
public void verifyloginpage () throws Exception { 

//create object of Loginpage class to access the methods.
Loginpage login = new Loginpage(driver); 

// to pass the username and password and click on logib button
login.loginHRMpage("Admin", "admin");

// to take screenshot of the home page after login calling as ClassName.methodname
ExcelFunctionlib.takeScreenshot(driver, "d://OHRMhome.jpg");

//to click on logout button for orangehrm 
login.logoutHRM();
//login.closebrowser();
}


//After test annotations having to close the browser page 
@AfterTest
public void closebrowser () {
	
Loginpage login = new Loginpage(driver);

login.closebrowser();
	
}

      }


