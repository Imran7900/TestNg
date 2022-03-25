
package testcases;
//import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LogintestNG extends BaseClass{
	
          @Test
          public void Loginfailure() {
        	 // test = report.startTest("Loginfailur");
        	  
        	  LoginPage login = new LoginPage();
        	  login.Loginfunction("xyz@avfadf.com","Abc@12345" );
	        WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
			
			String ActualMsg = ErrorMsg.getText();
			String ExpMsg = "The email or password you have entered is invalid.";
			Assert.assertEquals(ActualMsg, ExpMsg);
			//report.endTest(test);
          }
			@Test
			public void LoginSuscessTest() {
				//test = report.startTest("LoginSuscessTest");
			LoginPage login = new LoginPage();	  
			login.Loginfunction("immuimran382@gmail.com","Imran@immu79" );
			//report.endTest(test);    
		}
			
			@Test
			@Parameters({"Param1","Param2"})
			public void ParameterizedTest(String Usenamevalue, String Passwordvalue ) {
				LoginPage login = new LoginPage();
			    login.Loginfunction(Usenamevalue, Passwordvalue);
			}
			
			@Test
			public void ExternalDataTest() {
				
				String Usenamevalue = sheet.getRow(1).getCell(0).getStringCellValue();
				String Passwordvalue = sheet.getRow(1).getCell(1).getStringCellValue();
				LoginPage login = new LoginPage();
			    login.Loginfunction(Usenamevalue, Passwordvalue);
				
			}
			
		        
	}
			



