package FrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	
	static String base_url = "http://www.google.com";
	public WebDriver driver ; 		
	public static void Open_Google_url () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
	   //for the chrome driver code 
		WebDriver driver = new ChromeDriver();
		driver.get(base_url);
        driver.close();
	}

}
