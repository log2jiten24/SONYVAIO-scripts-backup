package Switchhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Author - Jitu
//Code - to open many browser window and print the title of each page 
//to close the last opened browser session
//to switch the control to parent window  


public class WindowHandlecode {
	
	static WebDriver driver ; 
	@BeforeTest
	public void openbrowser() 
	{ 
	//Setting the property of the browser and opening the Chrome Browser 
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new FirefoxDriver() ;
	//driver = new ChromeDriver() ;
	//maximize the browser 
	driver.manage().window().maximize();
	String baseUrl = "https://www.amazon.com/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyour-account%2Forder-history%3Fie%3DUTF8%26ref_%3Dya_d_c_yo&pageId=webcs-yourorder&showRmrMe=1";
	driver.get(baseUrl);
	 }

	

	 @Test (priority = 0 , enabled = true , description = "WindowHandling")

    public void verifyloginpage () throws Exception
   {
	
	//Implicit Wait 
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS)	 ;
		 
	WebElement conditions = driver.findElement(By.linkText("Conditions of Use"))	 ;
	//Click on Conditions of use link 
	conditions.click(); 
	Thread.sleep(2000);
	
	//Get the window handle of the first open browser 
	String firstwindow = driver.getWindowHandle();
	System.out.println ("title of first window :" + firstwindow) ; 
	Thread.sleep(2000);	
    
	//Get the window handle of the second open browser
	WebElement privacy = driver.findElement(By.linkText("Privacy Notice"))	 ;
	//Click on Conditions of use link 
	privacy.click(); 
	Thread.sleep(2000);
	
//	String secondwindow = driver.getWindowHandle().toString() ;
//	System.out.println ("title of second window :" + secondwindow) ; 
//	Thread.sleep(2000);
	
	//Get the browser opened for all the browser
	Set<String> openedbrowser = driver.getWindowHandles() ;
	for (String Browseropened : openedbrowser) 
	{
	//to print the title of the each browser 	
	String text = driver.switchTo().window(Browseropened).getTitle() ;
	System.out.println ("Browser title" + text);
	}
	//close the last opened browser 
	driver.close();
	//switch focus to the previous browser session 
	driver = driver.switchTo().window(firstwindow) ;
	 
	
    }
}  