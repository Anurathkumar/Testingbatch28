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
import pages.Complete_page;
import pages.LoginPage;

public class Complete_page_Test extends TestBase
{
	LoginPage login;
	Cart_Page cart;
	Checkout_page_2 check;
	Complete_page comp;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException 
	{
		initialization();
		login=new LoginPage();
		cart=new Cart_Page();
		check=new Checkout_page_2();
		comp=new Complete_page();
		login.loginToApplication();
		cart.VerifyCheckoutbutton();
		check.VerifyFinishBtn();
	}
	@Test
	public void VerifyCheckoutCompleteTest()
	{
		String expText="Checkout: Complete!";
		String actText=comp.VerifyCheckoutComplete();
		Assert.assertEquals(expText,actText);
		Reporter.log("Verify Checkout Complete Text = "+ actText);
	}
	@Test
	public void VerifyThankyoumsgTest()
	{
		String expText="Thank you for your order!";
		String actText=comp.VerifyThankyoumsg();
		Assert.assertEquals(expText,actText);
		Reporter.log("Verify Thankyou msg Text = "+ actText);
	}
	@Test
	public void VerifydispatchMsgTest()
	{
		String expText="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actText=comp.VerifydispatchMsg();
		Assert.assertEquals(expText,actText);
		Reporter.log("Verify dispatch Msg text = "+ actText);
	}
	@Test
	public void BacktoHomebtnTest()
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=comp.BacktoHomebtn();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("Backto Home btn working= "+ actURL);
	}
	@Test
	public void VerifyCompTickimgTest()
	{
		boolean tick=comp.VerifyCompTickimg();
		Assert.assertEquals(tick,true);
		Reporter.log("Complete Tick is Verified+"+ tick);
	}
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
}
