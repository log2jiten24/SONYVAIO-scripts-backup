package FrameworkDesign ;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Seleniumgrid {
	
	public  String node_url;
    public WebDriver driver ;
    public String String_url = "https://www.irctc.co.in/eticketing/loginHome.jsf" ;
	@ BeforeTest
	
public void nodesetup () throws MalformedURLException {
		//name of the node_url where we want to launch 
		//String node_url = "http://192.168.1./grid/register";
		
		String node_Url = "http://192.168.1.52:4444/grid/register";
		
		//create Desired Capabilities object 
		DesiredCapabilities capabilities = DesiredCapabilities.chrome() ;
		//set the name of the browser 
		capabilities.setBrowserName("chrome");
		//set any platform name - it will work on any platform name 
		capabilities.setPlatform(Platform.ANY);
		
		driver = new RemoteWebDriver(new URL(node_url), capabilities); 		
	  }
	
	@ Test
	public void test_url () {
		//launch the Irctc.com
		driver.get(String_url);
	}
	
	@AfterTest
	public void close_test() {
		//close the url
		driver.close();
	}
	
	
	
}