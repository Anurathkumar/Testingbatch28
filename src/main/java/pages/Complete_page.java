package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Complete_page extends TestBase
{
	@FindBy(xpath="//span[text()='Checkout: Complete!']") private WebElement CheckoutComplete;
	@FindBy(xpath="//img[@class='pony_express']") private WebElement CompTickimg;
	@FindBy(xpath="//h2[text()='Thank you for your order!']")private WebElement Thankyoumsg;
	@FindBy(xpath="//button[@id='back-to-products']")private WebElement BacktoHomebtn;
	@FindBy(xpath="//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")private WebElement dispatchMsg;
	public Complete_page()
	{
		PageFactory.initElements(driver,this);
	}
	public String VerifyCheckoutComplete()
	{
		return CheckoutComplete.getText();
	}
	public boolean VerifyCompTickimg()
	{
		return CompTickimg.isDisplayed();
	}
	public String VerifyThankyoumsg()
	{
		return Thankyoumsg.getText();
	}
	public String VerifydispatchMsg()
	{
		return dispatchMsg.getText();
	}
	public String BacktoHomebtn()
	{
		BacktoHomebtn.click();
		return driver.getCurrentUrl();
		
	}
	
}

