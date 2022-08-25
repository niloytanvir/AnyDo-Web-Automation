package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_004 extends BaseClass {
	
	@Test
	
	public void CreateList() throws InterruptedException
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test4 = extent.createTest("Create List 004","Creating My Shopping List");
		test4 .log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test4.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test4.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test4.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		Thread.sleep(10000);
		
		anydo.clickplusbutton();
		test4.pass("Starting Creating List");
		
		anydo.NameList(listname);
		Thread.sleep(3000);
		test4.pass("Entered List Name");
		logger.info("Entered List Name");
		
		Thread.sleep(3000);
		anydo.ClickCreate();
		test4.pass("List Added");
		logger.info("List Added");
		Thread.sleep(3000);
		
		test4.info("Test Completed");
		
		extent.flush();
	}

}
