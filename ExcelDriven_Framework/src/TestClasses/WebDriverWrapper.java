package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverWrapper {

	WebDriver driver;

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
	public void type(String xpathTarget,String value) {
		
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

	// To read value from any control : getTextOrValue
	public void getTextOrValue() {
	}

	// To click on browser : click
	public void click(String xpathTarget) {
		driver.findElement(By.xpath(xpathTarget)).click();
	}

	// To get title : getTitle
	public String getTitle() {
		return driver.getTitle();
	}
}
