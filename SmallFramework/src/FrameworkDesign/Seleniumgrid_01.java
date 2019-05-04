package FrameworkDesign ;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import java.net.MalformedURLException;
import java.net.URL;
 

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class Seleniumgrid_01 {
 static WebDriver driver;
 static String nodeUrl;
 
 @BeforeTest

 public void setup() throws MalformedURLException {
	 
 nodeUrl = "http://192.168.1.52:4444/wd/hub";
 //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
 //capabilities.setBrowserName("firefox");
 capabilities.setBrowserName("chrome");
capabilities.setPlatform(Platform.ANY);

 driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
 }
 
 @Test
 public void simpleTest() {
 driver.get("https://www.Google.com");
 
 }
 
 @AfterTest
 public void afterTest() {
 driver.quit();
 }
}