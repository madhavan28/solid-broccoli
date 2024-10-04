package AbstractComponents;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
	}

	public void visibilityOfElementLocated(By findby) {
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}

	
	public void screenshot() throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\mparthasarathi\\eclipse-workspace\\Grocery\\Grocery.png"));
	}
	
}
