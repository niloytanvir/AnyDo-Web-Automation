package com.anydo.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public String baseURL="https://desktop.any.do/";
	public String username="niloytanvirahmed@gmail.com";
	public String password="@torbap!";
	public String taskname="My Daily Task ";
	public String taskname2= "My Friday Task";
	public String note = "Hangout with friends";
	public String subtask = "Wake Up Early";///
	public String listname = "My Shopping List";
	public String item1 = "T-Shirt";
	public String item2 = "Pant";
	public String item3 = "Mouse";
	public String item4 = "Keyboard";
	
	public WebDriver driver;
	
	public static Logger logger = LogManager.getLogger(BaseClass.class);
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		if(br.equals("chrome"))
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
			
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(br.equals("ie"))
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\geckodriver.exe");
			driver = new InternetExplorerDriver();
		}

		

	}
	
	
	@AfterClass
	public void tearDown()
	{
      driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
