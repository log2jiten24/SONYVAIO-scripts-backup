package FrameworkDesign;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_HRM {

	
	static String base_urll = "http://opensource.demo.orangehrmlive.com/";
	public WebDriver driver ; 
	
public static void Open_OrangeHRM () {
		
	     System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	   //for the chrome driver code 
		WebDriver driver = new FirefoxDriver();
		driver.get(base_urll);
        driver.close();
	}
}
