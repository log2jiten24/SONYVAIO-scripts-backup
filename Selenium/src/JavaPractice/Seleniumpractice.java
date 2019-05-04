package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumpractice {

	static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new FirefoxDriver() ;
	
	driver.navigate().to("https://www.google.co.in/?gws_rd=ssl");
	
	//driver.findElement(By.cssSelector("#lst-ib")).sendKeys("AtalBihari");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input#lst-ib.gsfi")).sendKeys("AtalBihari");
	
	driver.close();	 

	}

}
