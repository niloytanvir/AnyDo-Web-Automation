package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDO_009 extends BaseClass {
	@Test
	
	public void CreateTag() throws InterruptedException
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test9 = extent.createTest("Create Tag 009","Creating Tag");
		test9.log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test9.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test9.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test9.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		Thread.sleep(10000);
		
		anydo.ClickTag();
		test9.pass("Clicked On Tag");
		logger.info("Clicked On Tag");
		Thread.sleep(3000);
		
		anydo.ClickNoThanks();
		Thread.sleep(3000);
		test9.pass("Clicked on No Thanks");
		logger.info("Clicked on No Thanks");	
		Thread.sleep(3000);
		
		test9.info("Test Completed");
		
		extent.flush();
	}

}
