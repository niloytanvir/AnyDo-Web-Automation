package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_006 extends BaseClass{

	
	@Test
	
	public void ChangeTheme() throws InterruptedException
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test6 = extent.createTest("Changing Theme 006","Select Light Theme");
		test6.log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test6.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test6.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test6.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		anydo.Settings();
		Thread.sleep(3000);
		test6.pass("Clicked Settings");
		logger.info("Clicked Settings");
		Thread.sleep(3000);
		
		anydo.ClickTheme();
		test6.pass("Starting Adding new theme");
		Thread.sleep(3000);
		
		anydo.ChoseTheme();
		Thread.sleep(3000);
		test6.pass("Theme Changed");
		logger.info("Theme Changed");
		Thread.sleep(3000);
		
		test6.info("Test Completed");
		
		extent.flush();
		Thread.sleep(10000);
	}
	
	
}
