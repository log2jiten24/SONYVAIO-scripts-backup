package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Protractor {
	
	private static final CharSequence FName1 = null;
	static WebDriver driver ;
	
	   @BeforeTest (enabled = true , description = "launching the browser and opening url")
		
		public void openbrowser() 
		{ 
		//Setting the property of the browser and opening the Chrome Browser 
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new FirefoxDriver() ;
		//driver = new ChromeDriver() ;
		//maximize the browser 
		driver.manage().window().maximize();
		String baseUrl = "http://www.way2automation.com/angularjs-protractor/webtables/";
		driver.get(baseUrl);
		 }
	 
	   
	   
	   @Test (priority = 0 , enabled = true , description = "Add new user")

	    public void verifyloginpage () throws Exception
       {	
        //clicking on add button
		//Implicitly wait    
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
	   
	   driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button/i")).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1");
	   Thread.sleep(2000);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName1");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");
	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();
	   Thread.sleep(2000);
	   Select select = new Select(driver.findElement(By.name("RoleId")));
	   select.selectByVisibleText("Admin");
	   Thread.sleep(2000);
	   driver.findElement(By.name("Email")).sendKeys("admin@mail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.name("Mobilephone")).sendKeys("082555");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
	   Thread.sleep(5000);
	   
	 //verifying first user
	   String text = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText();
	   System.out.println(text);
	   
	   if(text.contains(FName1))
			   System.out.println("User1 is added to the list");
	   else
		   System.out.println("User1 is not added to the list");
	   
	   
	   //Entering 2nd user details
	   //clicking on add user button
	   driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button/i")).click();
	   Thread.sleep(2000);
	   //filling 2nd user details
	   driver.findElement(By.xpath("//input[@name='FirstName']")).clear();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName2");
	   

	   driver.findElement(By.xpath("//input[@name='LastName']")).clear();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName2");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='UserName']")).clear();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User2");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='Password']")).clear();
	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass2");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input")).click();
	   Thread.sleep(2000);
	   Select oselect = new Select(driver.findElement(By.name("RoleId")));
	   oselect.selectByVisibleText("Customer");
	   Thread.sleep(2000);
	   driver.findElement(By.name("Email")).clear();
	   Thread.sleep(2000);
	   driver.findElement(By.name("Email")).sendKeys("customer@mail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.name("Mobilephone")).clear();
	   driver.findElement(By.name("Mobilephone")).sendKeys("083444");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
	   Thread.sleep(2000);
	   
	   
	     }
	   
	   
	   
	   @AfterTest 
	   public void closebrowser () {
		   
	   driver.close();	   
		   
	   }
		   
		   
	              }
	   
      
