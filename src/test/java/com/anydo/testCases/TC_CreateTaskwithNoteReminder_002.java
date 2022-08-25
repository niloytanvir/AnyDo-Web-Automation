package com.anydo.testCases;

import org.testng.annotations.Test;

import com.anydo.PageObjects.AnyDo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_CreateTaskwithNoteReminder_002 extends BaseClass {
	
	@Test
	
	public void createTaskNoteReminderTest() throws InterruptedException
	{
		{
			
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");

			// create ExtentReports and attach reporter(s)
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			ExtentTest test2 = extent.createTest("Create Task with Note & Reminder 002","Creating My Friday Task");
			test2 .log(Status.INFO, "Starting the test");
			driver.get(baseURL);
			test2.pass("Url is opened");
			
			AnyDo anydo = new AnyDo(driver);
			anydo.clickSubmit1();
			anydo.setUserName(username);
			test2.pass("Entered Username");
			logger.info("Entered Username");
			
			anydo.setPassword(password);
			test2.pass("Entered Password");
			logger.info("Entered Password");
			anydo.clickSubmit();
			
			Thread.sleep(10000);
			
			anydo.clickcreatetask();
			test2.pass("Starting Creating Task");
			
			anydo.clickIwantTo(taskname2);
			Thread.sleep(3000);
			test2.pass("Entered Task Name");
			logger.info("Entered Task Name");
			
			anydo.clicknotes(note);
			Thread.sleep(3000);
			test2.pass("Entered Note Name");
			logger.info("Entered Note Name");
			
			anydo.clickReminder();
			Thread.sleep(3000);
			test2.pass("Selected Reminder");
			logger.info("Selected Reminder");
			//Thread.sleep(3000);
			anydo.clickaddtask();
			test2.pass("Task Completed");
			logger.info("Task Completed");
			//Thread.sleep(3000);
			
			test2.info("Test Completed");
			
			extent.flush();
		}
	}

}
