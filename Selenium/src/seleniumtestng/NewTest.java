package seleniumtestng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import Frameworkcreation.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class NewTest {
	
	 static WebDriver driver ; 
	//WebDriver driver;
  @BeforeTest
  public void openbrowser () throws Exception {
	 
//	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//					driver = new FirefoxDriver();
//				    //WebDriver driver = new ChromeDriver();
//					String baseUrl = "http://opensource.demo.orangehrmlive.com/";
//					driver.manage().window().maximize();
//		            driver.get(baseUrl);
//					System.out.println("baseUrl is : "  +baseUrl);
	  
	  //to launch the driver and url 
	  
//	  Browseropen.initiateBrowser("firefox"); 
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
      driver = new FirefoxDriver();
	  String baseUrl = "http://opensource.demo.orangehrmlive.com/";
	  
      driver.get(baseUrl);
      driver.manage().window().maximize();
	  System.out.println("baseUrl is : "  +baseUrl);
	  driver.close();
  }				
  
//  public void afterTest() {
//	 
//	    String actualtitle = " ";
//		String expectedtitle = "OrangeHRM";
//		actualtitle = driver.getTitle();
//		System.out.println("actual title is " + actualtitle);
//		if (actualtitle.contentEquals(expectedtitle)){
//			System.out.println(" title of the test case is passed");
//		}
//		else{
//			System.out.println(" title of the test case is failed");
//		}
//		AssertJUnit.assertEquals(actualtitle,expectedtitle);
//	//to take the screenshots
//	try {
//    NewTest.takeSnapshot(driver, "d://OHRM.jpg");
//	} catch (Exception e) {
//	System.out.println(e.getMessage());
//	}
//}
//  
  @AfterTest
  public void closebrowser() {
	  driver.close();
  }
  
  }


