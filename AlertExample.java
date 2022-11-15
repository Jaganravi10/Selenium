package com.Selenium.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		//Accept an alert		
		WebElement clickAnAlert=driver.findElement(By.id("j_idt88:j_idt91"));
		clickAnAlert.click();
		Alert okAlert=driver.switchTo().alert();
		okAlert.accept();

		//Cancel an alert		
		WebElement cancelAnAlert=driver.findElement(By.id("j_idt88:j_idt93"));
		cancelAnAlert.click();
		Alert cancelAlert=driver.switchTo().alert();
		cancelAlert.dismiss();

		//Enter prompt box
		WebElement promptBox=driver.findElement(By.id("j_idt88:j_idt104"));
		promptBox.click();
		Alert enterPromt=driver.switchTo().alert();
		enterPromt.sendKeys("I got it");
		enterPromt.accept();



	}

}
