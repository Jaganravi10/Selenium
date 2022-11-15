package com.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement firstframe=driver.findElement(By.xpath("//button[@id='Click']"));
		firstframe.click();
		
		String textname=driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(textname);
		
		driver.switchTo().defaultContent();
		
		List<WebElement>numberofframes=driver.findElements(By.tagName("iframe"));
		int countofframes=numberofframes.size();
		System.out.println("Number of frames is: "+ countofframes);
		
		

	}

}
