package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Read;
import pages.LoginPage;
import utility.Capture_Screenshot;
import utility.ReadData;

public class LoginPageTest extends TestBase
{
	LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login=new LoginPage();
	} 
	@Test(priority=1,groups = "Sanity")
	public void verifytitleofApplicationTest() throws EncryptedDocumentException, IOException
	{
		String ActTitle=ReadData.readexcel(0,0);//Swag Labs(0,0)
		String expTitle=login.verifytitleofApplication();
		Assert.assertEquals(expTitle,ActTitle);
	}
	@Test //(priority=2,groups = {"Sanity","Retesting"})
	public void verifyURlofApplication() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readexcel(0,1);//https://www.saucedemo.com/(0,1)
		String actURL=login.verifyURlofApplication();
		Assert.assertEquals(expURL,actURL);
		
	}
	@Test //(priority=3,groups = "Regression")
	public void loginToApplicationTest() throws IOException
	{
		String expURL=ReadData.readexcel(0,2);//https://www.saucedemo.com/inventory.html(0,2)
		String actURL=login.loginToApplication();
		Assert.assertEquals(expURL,actURL);
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult it) throws IOException 
	{
		if(it.FAILURE==it.getStatus())
		{
			Capture_Screenshot.screenshot(it.getName());
		}
		report.flush();
		driver.close();
	}
	
	
}
