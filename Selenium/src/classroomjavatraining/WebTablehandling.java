package classroomjavatraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTablehandling {
	
	
	static WebDriver driver ; 
	
	@BeforeTest
	public void openbrowser () throws Exception 
	{ 
	//Setting the property of the browser and opening the Chrome Browser 
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new FirefoxDriver() ;
	//driver = new ChromeDriver() ;
	
	String baseUrl = "https://www.w3schools.com/html/html_tables.asp" ;
	driver.get(baseUrl);
	//maximize the browser 
	driver.manage().window().maximize();
	 }
	
	 @Test (priority = 0 , enabled = true , description = "webtable verification")

    public void verifyloginpage () throws Exception
   {
	
	//Implicit Wait 
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS)	 ;
	
	//to count the number of rows 
   List<WebElement> rows =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")) ;
   int rowcount = rows.size() ;
   System.out.println("total rows present :" + rowcount);
   
   //to print the content of each row for company column
	
   //observe the xpath - tr will change and td will remains constant 
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[7]/td[1]
   String beforexpathcomp = "//*[@id='customers']/tbody/tr[" ;
   String afterxpathcomp = "]/td[1]" ;
   
   for (int j = 2 ; j<=rowcount ; j ++)
   {
	String actualxpathcomp =  beforexpathcomp + j + afterxpathcomp ;
	WebElement tbldetails = driver.findElement(By.xpath(actualxpathcomp)) ;
	System.out.println("company column details :" + tbldetails.getText());
	if (tbldetails.getText().equalsIgnoreCase("Island Trading"))
	{
	System.out.println("content present :" +tbldetails.getText() + " "+ "present at" + (j-1 ));
	break ;
	}
   }
   
   System.out.println("*******************");
   
   //to print the contact details of the contact column ,we observed that tr will change and td will keep constant 
   
 //*[@id="customers"]/tbody/tr[2]/td[2]
 //*[@id="customers"]/tbody/tr[6]/td[2]
  String afterxpathcont = "]/td[2]" ;
   
   for (int j = 2 ; j<=rowcount ; j ++)
   {
	String actualxpathcont =  beforexpathcomp + j + afterxpathcont ;
	WebElement tbldetailscont = driver.findElement(By.xpath(actualxpathcont)) ;
	System.out.println("company column details :" + tbldetailscont.getText());
	if (tbldetailscont.getText().equalsIgnoreCase("Helen Bennett"))
	{
	System.out.println("content present :" +tbldetailscont.getText() + " "+ "present at" + (j-1 ));
	break ;
	}
   } 
   System.out.println("*******************");
   
   //to print the country details 
   String afterxpathcontry = "]/td[3]" ;
   
   for (int j = 2 ; j<=rowcount ; j ++)
   {
	String actualxpathcontry =  beforexpathcomp + j + afterxpathcontry ;
	WebElement tbldetailscontry = driver.findElement(By.xpath(actualxpathcontry)) ;
	System.out.println("company column details :" + tbldetailscontry.getText());
	if (tbldetailscontry.getText().equalsIgnoreCase("Canada"))
	{
	System.out.println("content present :" +tbldetailscontry.getText() + " "+ "present at" + (j-1 ));
	break ;
	}
   } 
   System.out.println("*******************");  
   
   //to print the table header details 
   
 //*[@id="customers"]/tbody/tr[1]/th[2]
 //*[@id="customers"]/tbody/tr[1]/th[3]
String beforexpathheader = "//*[@id='customers']/tbody/tr[1]/th[" ;   
String afterxpathheader = "]" ;

System.out.println("table header details :");
   
   for (int j = 1; j<=rowcount ; j ++)
   {
	String actualxpathheader =  beforexpathheader + j + afterxpathheader ;
	WebElement tbldetailsheader = driver.findElement(By.xpath(actualxpathheader)) ;
	System.out.println("company column details :" + tbldetailsheader.getText());
	
   }  
   
}
	 
}
