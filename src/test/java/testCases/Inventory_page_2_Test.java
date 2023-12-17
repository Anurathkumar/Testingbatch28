package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Inventory_page_2;
import pages.LoginPage;
import utility.ReadData;

public class Inventory_page_2_Test extends TestBase
{
	LoginPage login;
	Inventory_page_2 invent;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_page_2();
		login.loginToApplication();
	} 
	
	@Test(groups = {"Sanity","Retesting"})
	public void verifyproductslabelTest() throws EncryptedDocumentException, IOException
	{
		String expLable=ReadData.readexcel(0,3);//Products(0,3)
		String ActLable=invent.verifyproductslabel();
		Assert.assertEquals(expLable,ActLable);
		Reporter.log("Lable of Inventory Page =" + ActLable);
	}
	/*@Test(groups = {"Retesting","Regression"})
	public void verifyfootertextTest()
	{
		String exptext="© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		String acttext=invent.verifyfootertext();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Footer text of the inventory page = " +acttext);
	}*/
	@Test(groups = {"Sanity","Regression"})
	public void verifytwitterlogoTest()
	{
		boolean result=invent.verifytwitterlogo();
		Assert.assertEquals(result,true);
		Reporter.log("visibility of TwitterLogo=" + result);
		
	}
	@Test(groups = {"Sanity","Retesting"})
	public void verifyFacebooklogoTest()
	{
		boolean result1=invent.verifyFacebooklogo();
		Assert.assertEquals(result1,true);
		Reporter.log("visibility of FacebookLogo=" + result1);
	}
	@Test(groups = "Retesting")
	public void verifyLinkdeinlogoTest()
	{
		boolean result2=invent.verifyLinkdeinlogo();
		Assert.assertEquals(result2,true);
		Reporter.log("visibility of LinkdeinLogo=" + result2);
	}
	@Test(groups = "Sanity")
	public void Verify3linesTest() throws InterruptedException
	{
		boolean result3=invent.Verify3lines();
		Assert.assertEquals(result3,true);
		Reporter.log("Menu is displayed=" + result3);
	}
	@Test(groups = {"Sanity","Retesting"})
	public void add6productsTest() throws EncryptedDocumentException, IOException
	{
		String expCount=ReadData.readexcel(0,4);//6(0,4)
		String actcount=invent.add6products();
		Assert.assertEquals(expCount,actcount);
		Reporter.log( "Total number of product added to cart = "+ actcount);
		
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() 
	{
		driver.close();
	}
	

}
