/**
 * 
 */
package broswer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Jiten
 *
 */
public class Differentbrowsers {
	
	static WebDriver driver ;
	
	public static WebDriver different_browsers (String browsername , String url)
	{
		if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		  driver = new FirefoxDriver();
		}else if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  driver = new ChromeDriver() ;
		    }
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		}
	}


