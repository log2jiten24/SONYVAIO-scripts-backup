package FrameworkDesign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Functionlibrary.*;

public class Mousehoverr {

	static WebDriver driver ; 
	
	@BeforeTest (enabled = true , description = "launching the browser and opening url")
	
	public void openbrowser() 
	{
	//Setting the property of the browser and opening the Chrome Browser 
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	driver = new FirefoxDriver() ;
	
	//maximize the browser 
	driver.manage().window().maximize();
	
	String baseUrl = "http://opensource.demo.orangehrmlive.com/";
	driver.get(baseUrl);
	 }
	
	@Test (priority = 1 , enabled = true,  description = "Verify the title of the home  page")
	public void verifyhomepagedetails () throws Exception {
		
	driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	
	String actualtitle = " ";
	String expectedtitle = "OrangeHRM";
	actualtitle = driver.getTitle();
		   
	System.out.println("actual title is " + actualtitle);
		   
	if (actualtitle.contentEquals(expectedtitle)){
	System.out.println(" title of the test case is passed");
	}
	else {
	System.out.println(" title of the test case is failed");
	}
	
	}
	
	@Test (priority = 2 , enabled = true , description = "Verify the login homepage")
	public void verifyloginpage () throws Exception
	{
	//enter the userid 
	driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
	//enter the password
	driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("admin");
	Thread.sleep(5000);
	
	//click on submit
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);
	
	 //Actions class - to perform the action on the UserAdmin 
	WebElement 	Admin = driver.findElement (By.xpath("//a[@id = 'menu_admin_viewAdminModule']"));
	Actions builder = new Actions(driver);
	Action mouseover = builder.moveToElement(Admin).build() ;
	mouseover.perform();
	   
	WebElement UserManagement = driver.findElement(By.xpath("//a[@id = 'menu_admin_UserManagement']"));
	Action mouseover2 = builder.moveToElement(UserManagement).build() ;
	mouseover2.perform();
	Thread.sleep(5000);
	
	//click on the user
	WebElement Users = driver.findElement(By.xpath("//*[@id = 'menu_admin_viewAdminModule']//following::a[2]"));
	Users.click();
	
	//take the Screenshot of the Userlogin 
    ExcelFunctionlib.takeScreenshot(driver, "c://userslogin.jpg");
	}
	
	
	@AfterTest (enabled = true , description = "closing the browser")
	public void closebrowser ()
	{
	
	//logout from the application 
	driver.findElement(By.linkText("Welcome Admin")).click(); 
    driver.findElement(By.linkText("Logout")).click();	
    driver.close();
	}
	
	

 

  }