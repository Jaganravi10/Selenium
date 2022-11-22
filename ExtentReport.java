package com.Selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	WebDriver driver;	
	ExtentReports report;
	ExtentTest test;
	ExtentHtmlReporter htmlreporter; 
	
	@BeforeSuite
	public void launchBrowser() {
		report = new ExtentReports();	
		htmlreporter = new ExtentHtmlReporter("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\ExtentReport\\demotest.html");
		report = new ExtentReports();
		report.attachReporter(htmlreporter);
	}
	
	@Test
	public void openGoogle() {
		test=report.createTest("Verify Google Title");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		if(title.equals("Google")) {
			test.log(Status.PASS, "Actual and expected title are equal");
		}else {
			test.log(Status.PASS, "Actual and expected title are not equal");
		}
		driver.quit();
		report.flush();
	}

}
