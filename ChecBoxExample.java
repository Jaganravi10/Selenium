package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChecBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement toggleslider=driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggleslider.click();
		
		WebElement checkboxdisabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		boolean disabled=checkboxdisabled.isEnabled();
		System.out.println(disabled);
		
	}

}
