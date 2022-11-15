package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.id("j_idt88:name"));
		userName.sendKeys("Jagan");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
		appendBox.sendKeys(" Tamil Nadu");

		WebElement getTextBox=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value=getTextBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		clearBox.clear();
		
		WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);
		
	}

}
