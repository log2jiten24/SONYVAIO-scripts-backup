package seleniumtestng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class TakeScreenshot2 {
	String baseUrl = "http://opensource.demo.orangehrmlive.com/";
	
	
	//main function to perform
	public void testtakeScreenshot() throws Exception {
	//Call takeSnapshot function 
		WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
	    //WebDriver driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.manage().window().maximize();
        driver.get(baseUrl);
		System.out.println("baseUrl is : "  +baseUrl);	
	    TakeScreenshot2.takeSnapshot (driver, "d://OHRM.jpg");
	    driver.close();
		}
	

public static void takeSnapshot (WebDriver webdriver, String fileWithPath) throws Exception {
	
	try {
	//Convert WebDriver object to takeScreenshot 
	TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
	//Call getScreenshotAs method to create image file 
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    //move image file to new destination 
	File DestFile = new File (fileWithPath);
	//Copy file at destination 
	FileUtils.copyFile(SrcFile, DestFile);	

}catch (Exception e) {
System.out.println(e.getMessage());
  }
   }
      }