package testCases;

import java.io.IOException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.LoginPage;
import utility.Capture_Screenshot;

public class VerifyMultiple_Credentials_Test extends TestBase
{
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login=new LoginPage();
	}
	@DataProvider(name="Credentials")
	public Object[][]getData()
	{
		return new Object[][]
				{
			         {"standard_user","secret_sauce"},//correct un ,correct pass
			         {"problem_user","secret_sauce"},//correct un ,correct pass
			         {"performance_glitch_user","secret_sauce"},
			         {"error_user","secret_sauce"},
			         {"visual_user","secret_sauce"},
			         /*{"standard_user","secret_sauc"},//correct un ,incorrect pass
			         {"standard_use","secret_sauce"},//incorrect un ,correct pass
			         {"standard_use","secret_sauc"},//incorrect un ,incorrect pass
			         {"locked_out_user","secret_sauce"},
			         {"problem_user","secret_sauce"},//correct un ,correct pass
			         {"problem_user","secret_sauc"},//correct un ,incorrect pass
			         {"problem_use","secret_sauce"},//incorrect un ,correct pass
			         {"problem_use","secret_sauc"},//incorrect un ,incorrect pass
			         {"performance_glitch_user","secret_sauce"},
			         {"performance_glitch_user","secret_sauc"},
			         {"performance_glitch_use","secret_sauce"},
			         {"performance_glitch_use","secret_sauc"},
			         {"error_user","secret_sauce"},
			         {"error_user","secret_sauc"},
			         {"error_use","secret_sauce"},
			         {"error_use","secret_sauc"},
			         {"visual_user","secret_sauce"},
			         {"visual_user","secret_sauc"},
			         {"visual_use","secret_sauce"},
			         {"visual_use","secret_sauc"},*/
				};
	}
	@Test(dataProvider = "Credentials")
	public void logintoAppWithmultiCredsTest(String un,String pass)
	{
		SoftAssert s=new SoftAssert();
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=login.logintoAppWithmultiCreds(un, pass);
		s.assertEquals(expURL, actURL);
		s.assertAll();
		
	}

	@AfterMethod
	public void closeBrowser(ITestResult it) throws IOException 
	{
		if(it.FAILURE==it.getStatus())
		{
			Capture_Screenshot.screenshot(it.getName());
		}
		driver.close();
	}
	
	

	
}
