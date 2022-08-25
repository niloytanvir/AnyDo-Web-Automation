package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_010 extends BaseClass{
	
	
	@Test
	
	public void SignOut() throws InterruptedException
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test10 = extent.createTest("Sign Out","Sign Out From AnyDo");
		test10.log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test10.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test10.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test10.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		anydo.Settings();
		Thread.sleep(3000);
		test10.pass("Clicked Settings");
		logger.info("Clicked Settings");
		Thread.sleep(3000);
		
		anydo.ClickMyProfile();
		test10.pass("Clicked on My Profile");
		logger.info("Clicked on My Profile");
		Thread.sleep(3000);
		
		anydo.ClickSignOut();
		Thread.sleep(3000);
		test10.pass("Clicked Sign Out");
		logger.info("Clicked Sign Out");
		Thread.sleep(3000);
		
		test10.info("Test Completed");
		
		extent.flush();
		Thread.sleep(10000);
	}
	

}
