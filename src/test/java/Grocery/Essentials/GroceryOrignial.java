package Grocery.Essentials;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Grocery.pagecomponents.CartPage;
import Grocery.pagecomponents.Finalpage;
import Grocery.pagecomponents.landingpage;

public class GroceryOrignial extends BaseTest   {
	


public static WebDriver driver;
	@Test
	public  void grocery() throws InterruptedException, IOException {
		WebDriver driver=browser();
		String vegetable="Cucumber";
		landingpage lp = new landingpage(driver);
		lp.towardscartpage(vegetable);
		CartPage cp=new CartPage(driver);
		cp.cartpage();
		Finalpage fp=new Finalpage(driver);
		fp.finalpage();

		
	}

	
	
}
