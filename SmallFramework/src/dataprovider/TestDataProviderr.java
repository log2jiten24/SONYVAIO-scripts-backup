/**
 * 
 */
package dataprovider;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Functionlibrary.ExcelFunctionlib;

/**
 * @author Jiten using DataProvider passing vales using 2D Array.
 *
 */
public class TestDataProviderr {

 public  static String  String_url = "http://opensource.demo.orangehrmlive.com/index.php/auth/login" ;
 
  static WebDriver driver ;

// this test case is dependent  on the dataProvider  
@Test (dataProvider = "loginHRMPageData")
public void login_HRM_DataProvider (String username , String password ) throws Exception {

System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");	
driver = new FirefoxDriver();
driver.manage().window().maximize();
//Implicit wait for 20 secs
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get(String_url);
//driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
driver.findElement(By.id("txtUsername")).sendKeys(username);
Thread.sleep(2000);
driver.findElement(By.id("txtPassword")).sendKeys(password);
Thread.sleep(5000);
driver.findElement(By.id("btnLogin")).click();
Thread.sleep(5000);
//System.out.println("title of home page" + "-" + driver.getTitle());
//Assert.assertTrue(driver.getTitle().contentEquals("OrangeHRM"), "User is not able to login succesfully");
Assert.assertTrue(driver.getCurrentUrl().contains("http://opensource.demo.orangehrmlive.com/index.php/dashboard"), "User is unable to login succesfully ");
//driver.quit();
System.out.println ("login page is succesfully verified - user is able to login succesfully");

//to take the screenshot of login home page
ExcelFunctionlib.takeScreenshot(driver, "c://OHRM.jpg");
//to logout the HRM login page 
driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();

//to click on logout
//driver.findElement(By.linkText("Logout")).click();
driver.findElement(By.linkText("Cerrar sesión")).click();
//driver.quit();
}


@AfterMethod
public void teardown () {

	driver.quit();
	
}


@DataProvider(name = "loginHRMPageData")
public Object[][] getData (){
	
	//creating aray name as data having array types as Object
	//having 3 rows and 2 columns
	Object [][] data = new Object[3][2];
	//in the memory it will create 3 rows and 
	//2 columns having username and password
	//Insert data into the array
	//first row
	data[0][0] = "Adm";
	data[0][1] = "adm";
	
	//second row 
	data[1][0] = "Admin";
	data[1][1] = "admin";
	
	//third row 
	data[2][0] = "Admistrator";
	data[2][1] = "admins";
	
	return data ;
	}
      }

