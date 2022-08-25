package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_AnyDo_008 extends BaseClass{
	
	@Test
	public void AddMultipleSelection() throws InterruptedException
	{
		
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

			// create ExtentReports and attach reporter(s)
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			ExtentTest test8 = extent.createTest("Add Selection 008","Adding Multiple Selection");
			test8 .log(Status.INFO, "Starting the test");
			driver.get(baseURL);
			test8.pass("Url is opened");
			
			AnyDo anydo = new AnyDo(driver);
			anydo.clickSubmit1();
			anydo.setUserName(username);
			test8.pass("Entered Username");
			logger.info("Entered Username");
			
			anydo.setPassword(password);
			test8.pass("Entered Password");
			logger.info("Entered Password");
			anydo.clickSubmit();
			
			Thread.sleep(10000);
			
			anydo.clickonList();
			test8.pass("Selected My Shopping List");
			logger.info("Selected My Shopping List");
			Thread.sleep(3000);
			
			anydo.AddSelection();
			test8.pass("Clicked on more option");
			logger.info("Clicked on more option");
			Thread.sleep(3000);
			
			anydo.MultipleSelection();
			test8.pass("Clicked on multiple selection");
			logger.info("Clicked on multiple selection");
					
			test8.info("Test Completed");
			
			extent.flush();
		}
	}

