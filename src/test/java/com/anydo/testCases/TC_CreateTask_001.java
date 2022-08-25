package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_CreateTask_001 extends BaseClass{
	
	@Test
	public void createTaskTest() throws InterruptedException

	{
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Create Task 001","Creating My First Task");
		test1 .log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test1.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test1.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test1.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		Thread.sleep(10000);
		
		anydo.clickcreatetask();
		test1.pass("Starting Creating Task");
		//Thread.sleep(3000);
		anydo.clickIwantTo(taskname);
		test1.pass("Entered Task Name");
		logger.info("Entered Task Name");
		//Thread.sleep(3000);
		anydo.clickaddtask();
		test1.pass("Task Completed");
		logger.info("Task Completed");
		//Thread.sleep(3000);
		
		test1.info("Test Completed");
		
		extent.flush();
	}
}
