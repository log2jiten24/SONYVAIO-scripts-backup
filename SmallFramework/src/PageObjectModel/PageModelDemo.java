/**
 * 
 */
package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Jiten implement POM Model with Page Factory.
 *
 */
public class PageModelDemo {

	WebDriver driver;
	
// store the WebElements locators inside the class page 
//username element storage 	
@FindBy(id = "txtUsername") 
@CacheLookup
WebElement userid ;

// password element storage 
@FindBy(how = How.ID , using = "txtPassword")
@CacheLookup
WebElement user_pwd ;

// login button element storage 
@FindBy(how = How.XPATH , using = "//*[@id=\"btnLogin\"]")
@CacheLookup
WebElement login_button ;

// logout keyword storage
@FindBy (how = How.XPATH , using = "//*[@id=\"welcome\"]" )
@CacheLookup
WebElement key_word ;

//logout link to click

@FindBy(how = How.LINK_TEXT, using = "Logout") 
@CacheLookup
WebElement log_out ;

//Create Constructor WebDriver 

public PageModelDemo (WebDriver ldriver) {
	
this.driver = ldriver ;	

}



public void login_OrangeHRM (String uid , String pwd) throws Exception {
	
userid.sendKeys(uid);	
user_pwd.sendKeys(pwd);
Thread.sleep(5000);
login_button.click();
Thread.sleep(5000);

}

public void log_outHRM () throws Exception {
	
key_word.click();
Thread.sleep(2000);
log_out.click();
Thread.sleep(5000);

}

//method to close the browser
public void closebrowser () {
	//close the browser 
driver.close();	
}
   }
