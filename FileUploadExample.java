package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		WebElement uploadButton=driver.findElement(By.xpath("//input[@type='file']"));
		uploadButton.sendKeys("C:\\Users\\Admin\\Downloads\\TestLeaf Logo.png");

		}
		
	}
