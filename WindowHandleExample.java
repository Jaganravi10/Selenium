package com.Selenium.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parentwindow=driver.getWindowHandle();
		
		WebElement firstbutton=driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		firstbutton.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String newwindow : allwindows) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		WebElement notification=driver.findElement(By.xpath("//i[@class='pi pi-globe']"));
		notification.click();
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		WebElement multiplewindow=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		multiplewindow.click();
		int numberofwindows=driver.getWindowHandles().size();
		System.out.println("Number of windows opened: "+ numberofwindows);
		
		WebElement dontcloseme=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
		dontcloseme.click();
		
		Set<String> newwindows=driver.getWindowHandles();
		for (String allnewwindows : newwindows) {
			if(!allnewwindows.equals(parentwindow));
			driver.switchTo().window(allnewwindows);
			driver.close();
			
		}
		
	

	}

}
