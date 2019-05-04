package FrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calendarcodeselect {
	
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
		String baseUrl = "https://www.path2usa.com/travel-companions";
		driver.get(baseUrl);
		 }
	 
	   @Test (priority = 0 , enabled = true , description = "Verify the calendar select")

	    public void verifyloginpage () throws Exception
     {
     //to edit the text box 
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		Thread.sleep(2000);
      
		//to select particular  month of the calendar..
		//!-negation of false condition is true and if true condition inside loop would be executed
		//!-negation of true  condition is false and if the condition is false the loop would be terminated
		
	  while (!driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'datepicker-switch'] ")).getText().contains("April"))
	  {
		 driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class = 'next']")).click(); 
	  }
		
		
		//to select a particular day of the month inside a calendar
		List<WebElement> datelist = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size() ;
		
		for (int i = 0; i <count ; i++)
		{
		String text = driver.findElements(By.className("day")).get(i).getText() ;
		
		if (text.equalsIgnoreCase("24"))
		{
			driver.findElements(By.className("day")).get(i).click();
			
			break ;
		}
			
		}
		
     }
         }