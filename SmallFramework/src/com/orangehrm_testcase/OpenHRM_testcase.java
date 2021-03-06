/**
 * 
 */
package com.orangehrm_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Functionlibrary.*;
import PageObjectModel.*;
import broswer.*;

/**
 * @author Jiten exploring POM Model with Page Factory
 *
 */
public class OpenHRM_testcase {

public  static String  filepath  = "D:\\Framework_01.xlsx"  ;

@Test
public void verifyloginHRM ( ) throws Exception {

//launches specific url in particular browser
WebDriver driver = Differentbrowsers.different_browsers("firefox", "http://opensource.demo.orangehrmlive.com/index.php/auth/login");
  
//Created PageObject of the PageModelDemo Class using PageFactory
PageModelDemo login = PageFactory.initElements(driver, PageModelDemo.class);

// to verify the title of the home page
String actual_title = "";
//get the title of the Orange HRM Home Page 
actual_title= driver.getTitle();
String expected_title = "OrangeHRM";
	
//Compare the expected_title with the actual_title 
if(actual_title.contentEquals(expected_title)) {
System.out.println(" title of the OrangeHRM loginpage is " + "-" + actual_title);
		}
else{
System.out.println(" title of the OrangeHRM loginpage is failed");
		}
Assert.assertEquals(actual_title, expected_title);

//to take the screenshot of loginpage 
ExcelFunctionlib.takeScreenshot(driver, "c://login.jpg");

//Method created to pass the username and password
//login.login_OrangeHRM("Admin", "admin");

Exampleexcelretrieve obj = new Exampleexcelretrieve() ;

//Method created to pass the username and password
login.login_OrangeHRM(obj.getData(filepath, 1, 1, 0), obj.getData(filepath, 1, 1, 1));

//to take screenshot of the home page after login calling as ClassName.methodname
ExcelFunctionlib.takeScreenshot(driver, "c://OHRM.jpg");

login.log_outHRM();

login.closebrowser();
	
}
	
   }


//ExcelFunctionlib obj = new ExcelFunctionlib(filepath);
//
////Method created to pass the username and password
//login.login_OrangeHRM(obj.getData(1, 1, 0), obj.getData(1, 1, 1));
