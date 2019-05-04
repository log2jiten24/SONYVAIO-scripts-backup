package Switchhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Switchhandle {
  @Test
  public void testpopup () {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	// It will return the parent window name as a String
	  String parent = driver.getWindowHandle();
	// This will return the number of windows opened by Webdriver 
	 //and will return Set of St//rings
	 Set <String>s1 = driver.getWindowHandles();
	 
	// Now we will iterate using Iterator
	 Iterator <String> i1 = s1.iterator();
	 
	 while (i1.hasNext()) {
		 
	String child_window = i1.next();
	
// Here we will compare if parent window is not equal to child window then we will close
	if (!parent.equals(child_window)) {
    driver.switchTo().window(child_window);
    
    System.out.println(driver.switchTo().window(child_window).getTitle());
    driver.close();
     }
	 }
	// once all pop up closed now switch to parent window
	 driver.switchTo().window(parent);
	 
	 //DISMISS THE ALERT 
	 try {
	 org.openqa.selenium.Alert alert = driver.switchTo().alert() ;
	 
	 System.out.println("alert text :" + alert.getText());
	 
	 alert.dismiss();
	 }
	 catch (Exception e ) {
		 System.out.println("catched exception" + e.getMessage());
	 }
	  
	 
  }
}



