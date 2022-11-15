package com.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		WebElement homeButton=driver.findElement(By.linkText("Go to Dashboard"));
		homeButton.click();	
		
		WebElement getURL=driver.findElement(By.tagName("a"));
		String linkAddress=getURL.getAttribute("href");
		System.out.println(linkAddress);
		
		WebElement brokenLink=driver.findElement(By.tagName("a"));
		boolean enabled=brokenLink.isEnabled();
		System.out.println(enabled);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links is "+links.size());
		
		
		

	}

}
