package com.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		WebElement datatable1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td[1]"));
		System.out.println(datatable1.getText());
		List<WebElement> companylist=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		for(int p=0;p<companylist.size();p++) {
			if(companylist.get(p).getText().equalsIgnoreCase("Muthoot Capital"));
			System.out.println(currentprice.get(p).getText());
			
		}

		
	}
	
}
