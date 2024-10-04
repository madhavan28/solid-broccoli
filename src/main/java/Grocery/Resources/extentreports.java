package Grocery.Resources;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {
	
	@Test
	public static ExtentReports getreports() {
		
		File file=new File(System.getProperty("user.dir")+"\\target\\index.html");
		ExtentSparkReporter extentreport=new ExtentSparkReporter(file);
		extentreport.config().setReportName("Grocery Test Report");
		extentreport.config().setDocumentTitle("Grocery Website");
		
		ExtentReports extentreports=new ExtentReports();
		extentreports.attachReporter(extentreport);
		return extentreports;
		
	}

}
