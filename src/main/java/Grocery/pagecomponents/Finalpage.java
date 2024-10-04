package Grocery.pagecomponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AbstractComponents.AbstractComponents;

public class Finalpage extends AbstractComponents  {

	WebDriver driver;
	

	
	public Finalpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	

//	WebElement str=driver.findElement(By.cssSelector(".products div select"));
	@FindBy(css=".products div select")
	WebElement str;
//	Select st=new Select(str);
//	st.selectByVisibleText("India");
	
//	driver.findElement(By.xpath("//input[@class='chkAgree']")).click();	
	@FindBy(xpath="//input[@class='chkAgree']")
	WebElement agree;

//	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceed;
	
	public void finalpage() throws IOException {
		WebElement str=driver.findElement(By.cssSelector(".products div select"));
		Select st=new Select(str);
		st.selectByVisibleText("India");
		agree.click();
		proceed.click();
		screenshot();
	}
}
