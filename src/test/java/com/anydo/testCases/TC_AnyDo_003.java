package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_003 extends BaseClass {
	
	@Test
	
	public void createSubTaskTest() throws InterruptedException

	{
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test3 = extent.createTest("Create Sub Task 003","Creating Wake Up Early");
		test3 .log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test3.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test3.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test3.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		Thread.sleep(10000);
		
		anydo.clickcreatetask();
		test3.pass("Starting Creating Task");
		
		anydo.clickIwantTo(taskname2);
		Thread.sleep(3000);
		test3.pass("Entered Task Name");
		logger.info("Entered Task Name");
		
		Thread.sleep(3000);
		anydo.clickaddtask();
		test3.pass("Task Added");
		logger.info("Task Added");
		Thread.sleep(3000);
		
		anydo.clickaddsubtask(subtask);
		test3.pass("Subtask Added");
		logger.info("Subtask Added");
		
		test3.info("Test Completed");
		
		extent.flush();
	}

}
