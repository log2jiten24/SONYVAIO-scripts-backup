package Keyworddrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.Setting;

public class WebDriverWrapper {

	static WebDriver driver;

	public WebDriverWrapper(WebDriver driver) {
		this.driver = driver;
	}

	// To Open Browser : open
	public void Open(String url) {
		driver.get(url);

	}

	// To close Browser :close
	public void close() {
		driver.quit();
	}

	// To Type in any control : type
	public static void type(String xpathTarget,String value) {
		
		WebElement ele = driver.findElement(By.xpath(xpathTarget));
		
		if(ele.getTagName().equalsIgnoreCase("select")){
			
			Select s = new Select(ele);
			s.selectByVisibleText(value);
		}
		else
		{
				driver.findElement(By.xpath(xpathTarget)).sendKeys(value);
		}
		
	}
	
	
	//to type the Password for Orangehrm page
	
	@SuppressWarnings("unused")
	public static void typePassword (String locator, String value ) throws Exception
	{
		WebElement ele = driver.findElement(By.xpath(locator));
		
		driver.findElement(By.xpath(locator)).sendKeys(value);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	// To read value from any control : getTextOrValue
	public void getTextOrValue() {
	}

	// To click on browser : click
	public void click(String locator) throws Exception {
		
		WebElement ele = driver.findElement(By.xpath(locator));
		
		driver.findElement(By.xpath(locator)).click();
		
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// To get title : getTitle
	public static String  getTitle() {
		return driver.getTitle();
	}
}

