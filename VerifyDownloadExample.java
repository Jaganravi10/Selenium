package com.Selenium.Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement verifydownload=driver.findElement(By.id("j_idt93:j_idt95"));
		verifydownload.click();
		Thread.sleep(3000);
		
//		File location: C:\\Users\\Admin\\Downloads\\TestLeaf Logo.png
		
		File folderLocation= new File("C:\\Users\\Admin\\Downloads"); 
		File[] allFiles=folderLocation.listFiles();
		
		for (File file : allFiles) {
			
			if(file.getName().equals("TestLeaf Logo.png")) {
			System.out.println("File is downloaded");
			break;
			
		}
		

	}

}
}
