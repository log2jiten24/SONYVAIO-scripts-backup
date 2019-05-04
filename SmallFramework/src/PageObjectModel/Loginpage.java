/**
 * 
 */
package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Jiten
 * Loginpage class where all the locators and methods will be stored .
 */
public class Loginpage {
//storing the elements using By Class (and By Class - Methods ).
	WebDriver driver ;
	By username = By.id("txtUsername") ;
	By password = By.xpath("//*[@id=\"txtPassword\"]");
	By loginbutton = By.className("button");
    By logoutkeyword = By.xpath("//*[@id=\"welcome\"]") ;
    By logout = By.linkText("Logout");
    
//Constructor to initialize driver 
public Loginpage (WebDriver driver) {
	 this.driver = driver ;
}  

// method having username and passwrod as combined parameter and 
// then clicking on Submit
public void loginHRMpage (String loginid , String userpassword) throws Exception {
	
	driver.findElement(username).sendKeys(loginid);
	driver.findElement(password).sendKeys(userpassword);
	Thread.sleep(5000);
	driver.findElement(loginbutton).click();
	Thread.sleep(5000);
}

// method to send username as parameter 
public void typeusername (String userid) { 
//pass the parameter to send userid as username - method 
driver.findElement(username).sendKeys(userid);	
}
//method to send password as parameter
public void typepassword (String loginpassword) {
//pass the parameter to send password as Password - method
driver.findElement(password).sendKeys(loginpassword);	
}

//method to click on login button
public void clickonlogin ()  {
//click on login button 	
driver.findElement(loginbutton).click();
}

public void logoutHRM() throws Exception {
	
driver.findElement(logoutkeyword).click();
Thread.sleep(5000);
driver.findElement(logout).click(); 
Thread.sleep(2000);
}

//method to close the browser
public void closebrowser () {
	//close the browser 
driver.close();	
}
    }