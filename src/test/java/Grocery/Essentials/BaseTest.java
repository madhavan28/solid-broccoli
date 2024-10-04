package Grocery.Essentials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import Grocery.Resources.extentreports;

public class BaseTest {

	public WebDriver driver;
	
	public WebDriver initializedriver() throws IOException {
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Grocery\\Resources\\GlobalData.properties");
	prop.load(fis);
	String browser=prop.getProperty("browser");
	
	if(browser.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		}
	
	else if (browser.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
	
	else if (browser.equalsIgnoreCase("Edge")) {
		driver=new EdgeDriver();
		
	}
	
	return driver;
	
	}
	
	public WebDriver browser() throws IOException {
	
	driver=initializedriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	return driver;
	}
	
	@AfterMethod
	public void closebrowser() {
		
		driver.close();
	
	}
}
