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
import Functionlibrary.ExcelRead;

/**
 * @author Jiten using DataProvider passing vales using Excel Sheet
 *
 */
public class TestDatafromExcel {

 public  static String  String_url = "http://opensource.demo.orangehrmlive.com/index.php/auth/login" ;
 
 public  static String  ExcelPath  = "C:\\Users\\Jiten\\eclipse-workspace\\SmallFramework\\Test Data\\User_login_data.xlsx" ;
 
 public  static WebDriver driver ;

// this test case is dependent  on the dataProvider  
@Test (dataProvider = "loginHRMPageData")
public void login_HRM_DataProvider (String username , String password ) throws Exception {

System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");	
driver = new FirefoxDriver();
driver.manage().window().maximize();
//Implicit wait for 20 secs
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get(String_url);
// to pass the input username and password
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

// DataProvider creates an internal memory having rows and columns and it stores the data 
@DataProvider(name = "loginHRMPageData")
public Object[][] getData (){
	

//Create object of the ExcelRead class 
ExcelRead readfromexcel = new  ExcelRead(ExcelPath) ;
	 
// it will take us the rowcount  of the number of rows present in the ExcelSheet
int rowcount = readfromexcel.rownumber(0);
	 
//creating aray name as data having array types as Object
//having 3 rows and 2 columns 
// pass the rowcount as number of rows to be created 
Object [][] data = new Object[rowcount][2];

//in the memory it will create 3 rows and 
//2 columns having username and password

//iterating through for loop for each row of the excel 
for (int i = 0 ; i < rowcount ; i ++ ) {
		
//to get the data for each row from the excel for 1st row and 1st column
data[i][0] = readfromexcel.getDatafromExcel(0, i, 0) ;
		
// to get the data for the second column and the row will iterate one after another. 
data[i][1] = readfromexcel.getDatafromExcel(0, i, 1) ;
		
	 }
	return data ;
	}
      }

