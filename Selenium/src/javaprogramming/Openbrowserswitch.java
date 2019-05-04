package javaprogramming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Openbrowserswitch {
  public  String browsertype;

@Test
  public void openurl(String broswertype) {
	
	switch (browsertype) {
	  
	  case "firefox" :
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.close();
	  break;
	  
	  case "chrome" :
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	   //for the chrome driver code 
	  WebDriver driver1 = new ChromeDriver();
	  driver1.get("http://opensource.demo.orangehrmlive.com/");
      driver1.close(); 
	  }

	/*Openbrowserswitch login = new Openbrowserswitch();
	login.openurl("firefox");*/
  }
}
