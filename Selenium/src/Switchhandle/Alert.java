package Switchhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert {
  @Test
  public void alerthandle() {
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	// It will return the parent window name as a String
	  String parent = driver.getWindowHandle();
	  Set <String> s1 = driver.getWindowHandles();
	  
	  Iterator <String> itr = s1.iterator();
	  while (itr.hasNext()) {
		  String frame = itr.next();
		  if (!parent.equals(frame)) {
			 driver.switchTo().window(frame);
			 System.out.println(driver.switchTo().window(frame).getTitle());
			 driver.close();
		  }
	  }
	  driver.switchTo().parentFrame();
  }
}
