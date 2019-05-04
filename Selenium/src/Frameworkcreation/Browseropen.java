package Frameworkcreation;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Browseropen {

	static WebDriver driver ;
	public static void initiateBrowser (String browsername) throws Exception 
	{
		
	if (browsername.equals("IE"))
	{
		DesiredCapabilities capab = DesiredCapabilities.internetExplorer() ;
		capab.setCapability
		(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		File file = new File ("C:\\IEDriverServer.exe") ;
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath())  ;
		driver = new InternetExplorerDriver(capab) ;
		}
	    else if (browsername.equals("firefox")) {
		DesiredCapabilities capability = DesiredCapabilities.firefox() ;
		File file = new File ("C:\\geckodriver.exe") ;
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath())  ;
		//driver = new FirefoxDriver(capability) ;
		}
	    else if (browsername.equalsIgnoreCase("chrome") )
	    {
	    	File file = new File ("C:\\chromedriver.exe") ; 
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath())  ;
			
			DesiredCapabilities capabiliities = DesiredCapabilities.chrome() ;
			capabiliities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new ChromeDriver(capabiliities) ;
	    }
	        }	
                }
