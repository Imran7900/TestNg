package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
 WebDriver driver = BaseClass.driver;
 ExtentTest test = BaseClass.test;
 
 @FindBy(linkText = "Log in")
 WebElement LoginLink;
 
 @FindBy(name= "user_login")
 WebElement UseName;
 
 @FindBy(name = "user_pwd")
 WebElement Password;
 
 @FindBy(name = "btn_login")
 WebElement LoginBtn;
 
 @FindBy(className = "RememberMe")
 WebElement RebemberMe;
 
 
public LoginPage() {
	PageFactory.initElements(driver, this);
}
 
 
 
	public void Loginfunction(String usernameValue, String Passwordvalue) {
  	  
		
		LoginLink.click();
		test.log(LogStatus.PASS, "click on login link", "login link clicked successfully");
		
		UseName.sendKeys(usernameValue);
		test.log(LogStatus.PASS, "enter your user name", "user name entered successfully");
		
		Password.sendKeys(Passwordvalue);
		test.log(LogStatus.PASS, "enter password", "passeord entered successfully");
		
		LoginBtn.click();
		test.log(LogStatus.PASS, "click on login button", "login button clicked successfully");

}
	public void UIcheck() {
		Assert.assertTrue(UseName.isDisplayed());
		
	}
}