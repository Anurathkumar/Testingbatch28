package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;
import utility.Handle_Dropdownlist;

public class Inventory_page_2 extends TestBase
{
	//object Repository
	@FindBy(xpath="//span[@class='title']") private WebElement productslabel;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement linesmenu;
	@FindBy(xpath="//div[@class='bm-menu']")private WebElement lineMenu;
	//@FindBy(xpath="//a[@id='about_sidebar_link']") private WebElement LineMenuoption1;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement Cartcount;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikelightproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement tshirtproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleecejacketproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesieproduct;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tshirtredproduct;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterlogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement Facebooklogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement Linkdeinlogo;
	@FindBy(xpath="//*[@id=\"page_wrapper\"]/footer/div") private WebElement footertext;
	//Constructor
	public Inventory_page_2()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyproductslabel()
	{
		return productslabel.getText();
	}
	public String verifyfootertext()
	{
		return footertext.getText();
	}
	public boolean verifytwitterlogo()
	{
		return twitterlogo.isDisplayed();
	}
	public boolean verifyFacebooklogo()
	{
		return Facebooklogo.isDisplayed();
	}
	public boolean verifyLinkdeinlogo()
	{
		return Linkdeinlogo.isDisplayed();
	}
	public boolean Verify3lines()
	{
		linesmenu.click();
		return lineMenu.isDisplayed();
		
	}
	public String add6products()
	{
		Handle_Dropdownlist.handleselectclass(dropdown,"Price (low to high)");
		backpackproduct.click();
		bikelightproduct.click();
		tshirtproduct.click();
		fleecejacketproduct.click();
		onesieproduct.click();
		tshirtredproduct.click();
		return Cartcount.getText();
	}
}
