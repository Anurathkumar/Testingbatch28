package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Cart_Page;
//import pages.Inventory_page_2;
import pages.LoginPage;

public class Cart_Page_Test extends TestBase
{
	LoginPage login;
	Cart_Page cart;
	//Inventory_page_2 invent;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login=new LoginPage();
		cart=new Cart_Page();
		//invent=new Inventory_page_2();
		login.loginToApplication();
		//invent.add6products();
	} 
	@Test
	public void VerifyQuantityTest() throws InterruptedException
	{
		String expLable="QTY";
		String ActLable=cart.VerifyQuantity();
		Assert.assertEquals(expLable,ActLable);
		Reporter.log("Lable of Quantity is =" + ActLable);
		Thread.sleep(3000);
	}
	@Test
	public void VerifyDiscriptionTest()
	{
		String expLable="Description";
		String ActLable=cart.VerifyDiscription();
		Assert.assertEquals(expLable,ActLable);
		Reporter.log("Lable of Description is =" + ActLable);
	}
	@Test
	public void verifyYourCarttextTest()
	{
		String expLable="Your Cart";
		String ActLable=cart.verifyYourCarttext();
		Assert.assertEquals(expLable,ActLable);
		Reporter.log("Lable of =" + ActLable);
	}
	@Test
	public void verifycarticonTest() throws InterruptedException
	{
		String exppage="https://www.saucedemo.com/cart.html";
		String Actpage=cart.verifycarticon();
		Assert.assertEquals(exppage,Actpage);
		Reporter.log("Cart page =" +Actpage);
		Thread.sleep(3000);
	}
	@Test
	public void ProductpresentincartTest()
	{
		boolean result=cart.Productpresentincart();
		Assert.assertEquals(result,true);
		Reporter.log("Product present in cart=" + result);
		
	}
	@Test
	public void verifyproductaddedintoCartTest() throws InterruptedException
	{
		String expproduct="2";
		String actproduct=cart.verifyproductaddedintoCart();
		Assert.assertEquals(expproduct, actproduct);
		Reporter.log("No of Products added into Cart= "+actproduct);
		Thread.sleep(3000);
	}
	@Test
	public void RemoveProductfromCartTest() throws InterruptedException
	{
		String expproduct="1";
		String actproduct=cart.RemoveProductfromCart();
		Assert.assertEquals(expproduct, actproduct);
		Reporter.log("No of Products removed into Cart= "+actproduct);
		Thread.sleep(3000);
	}
	@Test
	public void VerifyContinueShoppingbuttonTest()
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=cart.VerifyContinueShoppingbutton();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("after clicking Continue shopping button ="+actURL);
		
	}
	@Test
	public void VerifyCheckoutbuttonTest()
	{
		String expURL="https://www.saucedemo.com/checkout-step-one.html";
		String actURL=cart.VerifyCheckoutbutton();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("after clicking Checkout button ="+actURL);
		
	}
	@Test
	public void verifyTwitterlogoTest()
	{
		boolean result1=cart.verifyTwitterlogo();
		Assert.assertEquals(result1,true);
		Reporter.log("Visibility of Twitter logo = " + result1);
	}
	@Test
	public void verifyFacebooklogoTest()
	{
		boolean result2=cart.verifyFacebooklogo();
		Assert.assertEquals(result2,true);
		Reporter.log("visibility of FacebookLogo=" + result2);
	}
	@Test
	public void verifyLinkdeinlogoTest()
	{
		boolean result3=cart.verifyLinkdeinlogo();
		Assert.assertEquals(result3,true);
		Reporter.log("visibility of LinkdeinLogo=" + result3);
	}
	/*@Test
	public void verifyfootertextTest()
	{
		String exptext="© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		String acttext=cart.verifyfootertext();
		Assert.assertEquals(exptext,acttext);
		Reporter.log("Footer text of the inventory page = " +acttext);
	}*/
	@Test
	public void Verify3linesTest() throws InterruptedException
	{
		boolean result4=cart.Verify3lines();
		Assert.assertEquals(result4,true);
		Reporter.log("Menu is displayed=" + result4);
	}
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
	

}
