package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement dragfrom=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement dragto=driver.findElement(By.xpath("//div[@id='form:drop_content']"));

		Actions dragactions= new Actions(driver);
		dragactions.clickAndHold(dragfrom).moveToElement(dragto).release().build().perform();
		dragactions.dragAndDrop(dragfrom, dragto).build().perform();


	}

}
