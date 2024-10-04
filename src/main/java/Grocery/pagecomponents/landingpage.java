package Grocery.pagecomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class landingpage extends AbstractComponents  {

	WebDriver driver;
	

	
	public landingpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css=".cart-icon")
	WebElement carticon;
	@FindBy(css=".product")
	List<WebElement> veggies;
	
	By firstwait=By.xpath("//a[contains(@class,'increment')]");
	
	By increment=By.xpath("//a[contains(@class,'increment')]");
	
	By addbutton=By.cssSelector(".product-action button");
	
	public WebElement actionclass(String vegetable) {
		
		WebElement cart=veggies.stream().filter(veg->veg.findElement(By.cssSelector(".product-name")).getText().startsWith(vegetable)).findFirst().orElse(null);
		return cart;
		
	}
	
	public void towardscartpage(String vegetable) {
	WebElement cart=actionclass(vegetable);
	visibilityOfElementLocated(firstwait);
	cart.findElement(increment).click();
	cart.findElement(addbutton).click();
	carticon.click();
	
	}
}
