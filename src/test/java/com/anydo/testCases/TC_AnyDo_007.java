package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_007 extends BaseClass {
	
	@Test
	
	public void CheckNotifications() throws InterruptedException
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test7 = extent.createTest("Check New Notifications","Updated Notifications");
		test7 .log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test7.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test7.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test7.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		anydo.ClickNotifications();
		test7.pass("Notifications window opened");
		Thread.sleep(3000);
		
		anydo.ClickUpdate();
		Thread.sleep(3000);
		test7.pass("New Notifications Checked");
		logger.info("New Notifications Checked");
		Thread.sleep(3000);
		
		test7.info("Test Completed");
		
		extent.flush();
		Thread.sleep(10000);
	}

}
