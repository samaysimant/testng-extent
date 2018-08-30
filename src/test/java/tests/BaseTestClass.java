package tests;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTestClass {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void beforeSuite() {
		
		String reportPath = System.getProperty("user.dir") + "/test-output/extent-report";
		
		File reportFolder = new File(reportPath);
		if (!reportFolder.exists()) {
			reportFolder.mkdirs();
		}
		htmlReporter = new ExtentHtmlReporter(reportPath + "/Report.html");
		htmlReporter.loadXMLConfig(new File("config/extent-config.xml"));
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		System.out.println("Before Suite---------");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		extent.flush();
	}
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("before Method...");
		
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method...");
	}

}
