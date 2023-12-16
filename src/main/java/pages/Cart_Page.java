package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Cart_Page extends TestBase
{
	//object Repository
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement carticon;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikelightproduct;
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']") private WebElement bikelightinCartproduct;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") private WebElement backpackinCartproduct;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement productaddedintoCart;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']") private WebElement removebackpactproduct;
	@FindBy(xpath="//div[@class='cart_quantity_label']")private WebElement Quantity;
	@FindBy(xpath="//div[@class='cart_desc_label']")private WebElement Discription;
	@FindBy(xpath="//span[@class='title']")private WebElement YourCarttext;
	@FindBy(xpath="//button[@id='continue-shopping']")private WebElement ContinueShoppingbutton;
	@FindBy(xpath="//button[@id='checkout']")private WebElement Checkoutbutton;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement Twitterlogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement Facebooklogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement Linkdeinlogo;
	@FindBy(xpath="//*[@id=\"page_wrapper\"]/footer/div") private WebElement footertext;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement linesmenu;
	@FindBy(xpath="//div[@class='bm-menu']")private WebElement lineMenu;
	
	public Cart_Page()
	{
		PageFactory.initElements(driver,this);
	}
	public String VerifyQuantity()
	{
		carticon.click();
		return Quantity.getText();
	}
	public String VerifyDiscription()
	{
		carticon.click();
		return Discription.getText();
	}
	public String verifyYourCarttext()
	{
		carticon.click();
		return YourCarttext.getText();
	}
	public String verifycarticon()
	{
		carticon.click();
		return driver.getCurrentUrl();
	}
	public boolean Productpresentincart()
	{
		backpackproduct.click();
		bikelightproduct.click();
		carticon.click();
		return bikelightinCartproduct.isDisplayed(); 
		
	}
	public String verifyproductaddedintoCart()
	{
		backpackproduct.click();
		bikelightproduct.click();
		carticon.click();
		return productaddedintoCart.getText();
	}
	public String RemoveProductfromCart()
	{
		backpackproduct.click();
	    bikelightproduct.click();
	    carticon.click();
	    removebackpactproduct.click();
	    return productaddedintoCart.getText();
	}
	public String VerifyCheckoutbutton()
	{
		backpackproduct.click();
		bikelightproduct.click();
		carticon.click();
		Checkoutbutton.click();
		return driver.getCurrentUrl();
	}
	public String VerifyContinueShoppingbutton()
	{
		backpackproduct.click();
		bikelightproduct.click();
		carticon.click();
		ContinueShoppingbutton.click();
		return driver.getCurrentUrl();
	}
	public boolean verifyTwitterlogo()
	{
		return Twitterlogo.isDisplayed();
	}
	public boolean verifyFacebooklogo()
	{
		return Facebooklogo.isDisplayed();
	}
	public boolean verifyLinkdeinlogo()
	{
		return Linkdeinlogo.isDisplayed();
	}
	public String verifyfootertext()
	{
		return footertext.getText();
	}
	public boolean Verify3lines()
	{
		linesmenu.click();
		return lineMenu.isDisplayed();
		
	}
}

