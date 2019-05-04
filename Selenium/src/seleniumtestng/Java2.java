package seleniumtestng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Java2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
	   //for the chrome driver code 
		//WebDriver driver = new ChromeDriver();
	    
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.manage().window().maximize();
        driver.get(baseUrl);
		System.out.println("baseUrl is : "  +baseUrl);
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
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		Thread.sleep(5000);
     	driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Jitu"); 
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("employeeId")).sendKeys("0255");
		
		driver.findElement(By.id("photofile")).click();
		Runtime.getRuntime().exec("D:\\FileUpload.exe");
		Thread.sleep(10000);
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.linkText()
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();
//		String textboxname = "";
//		driver.findElement(By.id("lastName")).getText();
//	
//		textboxname = driver.findElement(By.id("lastName")).getText();
//		
//		System.out.println ("text box name is :" + textboxname);
//		String tagname = driver.findElement(By.id("lastName")).getTagName();	
//		
//		System.out.println ("tag box name is :" + tagname);
//		driver.findElement(By.id("chkLogin")).click();
//		Thread.sleep(5000);
		
	}

}
