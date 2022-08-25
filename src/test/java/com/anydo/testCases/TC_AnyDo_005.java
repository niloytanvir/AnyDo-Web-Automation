package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_005 extends BaseClass{
	
	
	@Test
	
	public void AddItemOnList() throws InterruptedException
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test5 = extent.createTest("Add Item On List 005","Adding T-Shirt, Pant, Mouse, Keyboard");
		test5 .log(Status.INFO, "Starting the test");
		driver.get(baseURL);
		test5.pass("Url is opened");
		
		AnyDo anydo = new AnyDo(driver);
		anydo.clickSubmit1();
		anydo.setUserName(username);
		test5.pass("Entered Username");
		logger.info("Entered Username");
		
		anydo.setPassword(password);
		test5.pass("Entered Password");
		logger.info("Entered Password");
		anydo.clickSubmit();
		
		anydo.clickonList();
		test5.pass("Starting Adding Item");
		
		anydo.NameItem(item1);
		Thread.sleep(3000);
		test5.pass("Entered Item Name");
		logger.info("Entered Item Name");
		
		Thread.sleep(3000);
		anydo.EnterItem();
		test5.pass("Item Added");
		logger.info("Item Added");
		Thread.sleep(3000);
		
		test5.info("Test Completed");
		
		extent.flush();
		Thread.sleep(10000);
	}
	
	

}
