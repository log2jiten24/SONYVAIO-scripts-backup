package seleniumtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Mousehover {

	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
    driver = new FirefoxDriver();
	//driver = new ChromeDriver();
	
   //opening the url 
   String baseUrl = "http://opensource.demo.orangehrmlive.com/";
   driver.manage().window().maximize();
   driver.get(baseUrl);
   
   //Implicitly wait 
   driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
   String actualtitle = " ";
   String expectedtitle = "OrangeHRM";
   actualtitle = driver.getTitle();
   
   System.out.println("actual title is " + actualtitle);
   
	if (actualtitle.contentEquals(expectedtitle)){
		System.out.println(" title of the test case is passed");
	}
	else{
		System.out.println(" title of the test case is failed");
	}
	
	driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
   //enter the userid 
	driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
	//enter the password
	driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("admin");
	Thread.sleep(5000);
	//click on Submit 
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);
	
   //Action builder class  for mouseover 
	
   WebElement 	Admin = driver.findElement (By.xpath("//a[@id = 'menu_admin_viewAdminModule']"));
   
   driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
   //Actions class - to perform the action on the UserAdmin 
   Actions 	builder = new Actions(driver);
   Action mouseover = builder.moveToElement(Admin).build() ;
   mouseover.perform();
   
   WebElement UserManagement = driver.findElement(By.xpath("//a[@id = 'menu_admin_UserManagement']"));
   Action mouseover2 = builder.moveToElement(UserManagement).build() ;
   mouseover2.perform();
   Thread.sleep(5000);
   driver.findElement(By.linkText("users")).click();
   Thread.sleep(2000);
   
   
   //logout from the application 
   driver.findElement(By.linkText("Welcome Admin")).click(); 
   driver.findElement(By.linkText("Logout")).click();
    	
   
   
   driver.close();
	
	

	}

}
