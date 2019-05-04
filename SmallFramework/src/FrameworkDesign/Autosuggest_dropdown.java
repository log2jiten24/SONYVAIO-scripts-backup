package FrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class Autosuggest_dropdown {
	//type Beng
	//verify the airport is present in the autosuggest dropdown
	
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
		
		String baseUrl = "https://www.ksrtc.in";
		driver.get(baseUrl);
		 }
	   
	   
	   @Test (priority = 0 , enabled = true , description = "Verify the autosuggestive  dropdowns")

	    public void verifyloginpage () throws Exception
        {
      
	   //to edit the text box 
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		
		//to enter through keyboard
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//Selenium doesnt identify text for hidden text when class used is hidden ,it will
		//not extract the hidden text insid it 
//      System.out.println("content present inside dropdown"
//      + driver.findElement(By.id("fromPlaceName")).getText());
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
	    //usage of Javascript via Javascript Executor API
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		//Java doesnt accept two double quotes, to eliminate double quotes use forward slash 
		//it will eliminate error
		//in javascript to store the value we use return keyword
		String textvalue = "return document.getElementById(\"fromPlaceName\").value;" ;
		//to store the value of the dropdown in a string and typecaste it
		String text = (String) js.executeScript(textvalue);
		System.out.println("content present inside dropdown" + " "+ text);
		
		int i = 0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIORT"))
		{
		i++  ;	
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);	
		text = (String) js.executeScript(textvalue);
		System.out.println("content present inside dropdown" + " "+ text);
		if (i>10)
		{
		break ;
		}
		 }
	    if (i>10)
		{
		System.out.println("content not present");	
		}
	    else {
	    System.out.println("content  present");		
	    }
       
          }
             }