package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.TestBase;
import utility.ReadData;

public class LoginPage extends TestBase
{
	// object repository
	@FindBy(xpath="//input[@name='user-name']") private WebElement userTxtBox;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordTxtBox;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn;
	@FindBy(xpath="//h3[contains(@text,'')]") private WebElement ErrorMsg;
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
	public String loginToApplication()
		{
		    logger=report.createTest("Login to Sause Lab Application");
			userTxtBox.sendKeys("standard_user");//(0,6)
			logger.log(Status.INFO,"User Name is Entered");
			passwordTxtBox.sendKeys("secret_sauce");//(0,7)
			logger.log(Status.INFO,"Password is Entered");
			loginBtn.click();
			logger.log(Status.INFO,"Login Button is Clicked");
			logger.log(Status.PASS,"Login is Successfull");
			return driver.getCurrentUrl();	
		}
	public String logintoAppWithmultiCreds(String un,String pass)
	{
		userTxtBox.sendKeys(un);//(0,6)
		passwordTxtBox.sendKeys(pass);//(0,7)
		loginBtn.click();
		
		return driver.getCurrentUrl();	
		
	}

	public String verifytitleofApplication()
	
	{
		logger=report.createTest("Verify the Title of the Application ");
		logger.log(Status.INFO,"Expected Title Matches the Actual Title ");
		logger.log(Status.PASS,"Title of the Application is verified ");
		return driver.getTitle();
		
	}
	public String verifyURlofApplication() 
	{
		logger=report.createTest("Verify URL of the Application ");
		logger.log(Status.FAIL,"URL is not Verified ");
		return driver.getCurrentUrl();
		
	}
}
