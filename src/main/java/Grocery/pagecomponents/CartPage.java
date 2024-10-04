package Grocery.pagecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents  {

	WebDriver driver;
	

	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	By secondwait=By.cssSelector(".promoCode");
	
	By thirdwait= By.xpath("//span[@class='promoInfo']");
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement chktn;

	@FindBy(css=".promoCode")
	WebElement promocode;

	@FindBy(css="button[class='promoBtn']")
	WebElement promobutton;
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeorder;
	
	public void cartpage() {
		
		chktn.click();
		visibilityOfElementLocated(secondwait);
		promocode.sendKeys("rahulshettyacademy");
		promobutton.click();
		visibilityOfElementLocated(thirdwait);
		placeorder.click();
		
	}
	
	
}
