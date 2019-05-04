package FrameworkDesign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Functionlibrary.ExcelFunctionlib;

public class DynamicXpath {

 static WebDriver driver ;
	
   @BeforeTest (enabled = true , description = "launching the browser and opening url")
	
	public void openbrowser() 
	{ 
	//Setting the property of the browser and opening the Chrome Browser 
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new FirefoxDriver() ;
	//driver = new ChromeDriver() ;
	//maximize the browser 
	driver.manage().window().maximize();
	
	String baseUrl = "https://in.yahoo.com/?p=us";
	driver.get(baseUrl);
	 }
	
    @Test (priority = 0 , enabled = true , description = "Verify the login homepage")

    public void verifyloginpage () throws Exception

    {
    //implicitly wait for 10 seconds 
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
   //send input as Selenium
	driver.findElement(By.xpath("//input[@id = 'uh-search-box']")).sendKeys("Selenium");
    Thread.sleep(5000); 
   
   List<WebElement>seleniumlist = driver.findElements(By.xpath("//*[starts-with(@id ,'uh-assist-link')]")) ;
   Thread.sleep(2000);
   
   int a = seleniumlist.size() ;
   System.out.println("size of the selenium weblist " + a);
   
   for (int i = 0; i <a ; i ++) 
   {
   String elements  = seleniumlist.get(i).getText() ;
	   
   System.out.println("each element text" + "-" + elements);	 
   
   if (elements.equalsIgnoreCase("seleniumfoods")) {

   Thread.sleep(5000);	   
   seleniumlist.get(i).click();
   Thread.sleep(5000);
   
   //take the Screenshot of the Userlogin 
   
   ExcelFunctionlib.takeScreenshot(driver, "c://homelogin.jpg");
 	   
   }
      }
          }
    
    @AfterTest (enabled = true , description = "closing the browser")
	public void closebrowser ()
	{
    driver.close();                 
	 }
            }

