package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Cart_Page;
import pages.Checkout_page_2;
import pages.LoginPage;

public class Checkout_page_2_Test extends TestBase
{
	LoginPage login;
	Cart_Page cart;
	Checkout_page_2 check;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException 
	{
		initialization();
		login=new LoginPage();
		cart=new Cart_Page();
		check=new Checkout_page_2();
		login.loginToApplication();
		cart.VerifyCheckoutbutton();
	}
	@Test
	public void Checkoutpage2Test() throws InterruptedException
	{
		String expURL="https://www.saucedemo.com/checkout-step-two.html";
		String actURL=check.Checkoutpage2();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of the checkoutpage 2 ="+ actURL);
	}
	@Test
	public void VerifyPaymentinfotextTest() throws InterruptedException
	{
		String exptext="Payment Information";
		String acttext=check.VerifyPaymentinfotext();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Payment Information Text ="+ acttext);
	}
	@Test
	public void VerifySaucecardinfoTest() throws InterruptedException
	{
		String exptext="SauceCard #31337";
		String acttext=check.VerifySaucecardinfo();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Saucecardinfo Text ="+ acttext);
	}
	@Test
	public void VerifyShippinginfoTest() throws InterruptedException
	{
		String exptext="Shipping Information";
		String acttext=check.VerifyShippinginfo();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Shipping Information Text ="+ acttext);
	}
	@Test
	public void VerifyPriceTotalTest() throws InterruptedException
	{
		String exptext="Price Total";
		String acttext=check.VerifyPriceTotal();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Price Total Text ="+ acttext);
	}
	@Test
	public void VerifyTotalPriceTest() throws InterruptedException
	{
		String exptext="Total: $43.18";
		String acttext=check.VerifyTotalPrice();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Total Text ="+ acttext);
	}
	@Test
	public void VerifyQTYtextTest() throws InterruptedException
	{
		String exptext="QTY";
		String acttext=check.VerifyQTYtext();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Verify QTY text ="+ acttext);
	}
	@Test
	public void VerifyDescriptextTest() throws InterruptedException
	{
		String exptext="Description";
		String acttext=check.VerifyDescriptext();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Verify Description text ="+ acttext);
	}
	@Test
	public void VerifyCheckoverviewTest() throws InterruptedException
	{
		String exptext="Checkout: Overview";
		String acttext=check.VerifyCheckoverview();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Verify Checkoverview text ="+ acttext);
	}
	@Test
	public void Verifyitem1inchkpageTest() throws InterruptedException
	{
		boolean result=check.Verifyitem1inchkpage();
		Assert.assertEquals(result,true);
		Reporter.log("Item present in Checkout page 2=" + result);	
	}
	@Test
	public void VerifyFinishBtnTest() throws InterruptedException
	{
		String expURL="https://www.saucedemo.com/checkout-complete.html";
		String actURL=check.VerifyFinishBtn();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of the Finish Page ="+ actURL);
	}
	@Test
	public void VerifyCancelBtnTest() throws InterruptedException
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=check.VerifyCancelBtn();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL after clicking on Cancel Button ="+ actURL);
	}
	
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
 
}
