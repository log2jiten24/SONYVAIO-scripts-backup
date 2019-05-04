
package com.orangehrm_testcase;

import org.apache.log4j.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.Loginpage;
import Functionlibrary.*;

/**
 * @author Jiten
 * test case page where we will be calling methods and it acts as a test case java class 
 *
 */


@SuppressWarnings("unused")
public class Verifyloginpagetestcase {

public String base_url = "http://opensource.demo.orangehrmlive.com/";


@Test
public  void verifylogin() throws Exception {

// to set the gecko driver path to run the Mozilla firefox 	
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get(base_url);
//take the screenshot of login page 
ExcelFunctionlib.takeScreenshot(driver, "d://login.jpg");

String actual_title = "";
//get the title of the Orange HRM Home Page 
actual_title= driver.getTitle();
String expected_title = "OrangeHRM";
	
// Compare the expected_title with the actual_title 
if(actual_title.contentEquals(expected_title)) {
System.out.println(" title of the OrangeHRM loginpage is passed" + actual_title);
		}
else{
System.out.println(" title of the OrangeHRM loginpage is failed");
		}
Assert.assertEquals(actual_title, expected_title);
 

//create object of Loginpage class to access the methods.
Loginpage login = new Loginpage(driver); 

// to pass the username and password and click on logib button
login.loginHRMpage("Admin", "admin");

// to take screenshot of the home page after login calling as ClassName.methodname
ExcelFunctionlib.takeScreenshot(driver, "d://OHRM.jpg");

//to click on logout button for orangehrm 
login.logoutHRM();

//to close the browser 
login.closebrowser();
}
      }


