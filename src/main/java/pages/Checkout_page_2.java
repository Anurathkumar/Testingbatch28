package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Checkout_page_2 extends TestBase
{
	@FindBy(xpath="//input[@name='firstName']") private WebElement Firstname;
	@FindBy(xpath="//input[@name='lastName']") private WebElement Lastname;
	@FindBy(xpath="//input[@name='postalCode']") private WebElement postalcode;
    @FindBy(xpath="//input[@name='continue']") private WebElement Continuebtn;
    @FindBy(xpath="//div[text()='Payment Information']") private WebElement Paymentinfotext;
    @FindBy(xpath="//div[text()='SauceCard #31337']") private WebElement Saucecardinfo;
    @FindBy(xpath="//div[text()='Shipping Information']")private WebElement Shippinginfo;
    @FindBy(xpath="//div[text()='Price Total']") private WebElement PriceTotal;
    @FindBy(xpath="//div[@class='summary_info_label summary_total_label']")private WebElement TotalPrice;
    @FindBy(xpath="//a[@id='item_4_title_link']") private WebElement item1inchkpage;
    @FindBy(xpath="//button[@id='finish']") private WebElement FinishBtn;
    @FindBy(xpath="//button[@id='cancel']") private WebElement CancelBtn;
    @FindBy(xpath="//div[@class='cart_quantity_label']") private WebElement QTYtext;
    @FindBy(xpath="//div[@class='cart_desc_label']") private WebElement Descriptext;
    @FindBy(xpath="//span[text()='Checkout: Overview']") private WebElement Checkoverview;
    public Checkout_page_2()
    {
    	PageFactory.initElements(driver,this);
    }
    public String Checkoutpage2() throws InterruptedException
    {
    	Firstname.sendKeys("Anurath");
    	Lastname.sendKeys("Kumar");
    	postalcode.sendKeys("834004");
    	Continuebtn.click();
    	Thread.sleep(3000);
		return driver.getCurrentUrl();
    }
    public String VerifyPaymentinfotext() throws InterruptedException
    {
    	Checkoutpage2();
    	return Paymentinfotext.getText();
    }
    public String VerifySaucecardinfo() throws InterruptedException
    {
    	Checkoutpage2();
    	return Saucecardinfo.getText();
    }
    public String VerifyShippinginfo() throws InterruptedException
    {
    	Checkoutpage2();
    	return Shippinginfo.getText();
    }
    public String VerifyPriceTotal() throws InterruptedException
    {
    	Checkoutpage2();
    	return PriceTotal.getText();
    }
    public String VerifyTotalPrice() throws InterruptedException
    {
    	Checkoutpage2();
    	return TotalPrice.getText();
    }
    public String VerifyQTYtext() throws InterruptedException
    {
    	Checkoutpage2();
    	return QTYtext.getText();
    }
    public String VerifyDescriptext() throws InterruptedException
    {
    	Checkoutpage2();
    	return Descriptext.getText();
    }
    public String VerifyCheckoverview() throws InterruptedException
    {
    	Checkoutpage2();
    	return Checkoverview.getText();
    }
    public boolean Verifyitem1inchkpage() throws InterruptedException
    {
    	Checkoutpage2();
    	return item1inchkpage.isDisplayed();
    }
    public String VerifyFinishBtn() throws InterruptedException
    {
    	Checkoutpage2();
    	FinishBtn.click();
    	return driver.getCurrentUrl();
    }
    public String VerifyCancelBtn() throws InterruptedException
    {
    	Checkoutpage2();
    	CancelBtn.click();
    	return driver.getCurrentUrl();
    }
}