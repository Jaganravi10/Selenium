package com.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		WebElement firstCompany=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]"));
		System.out.println(firstCompany.getText());

//		List<WebElement> listOfCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
//		for (int i=0; i<listOfCompanies.size(); i++) {
//		System.out.println(listOfCompanies.get(i).getText());
//
//		List<WebElement> currentPriceOfAllCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
//		for (int i=0; i<listOfCompanies.size();i++) {
//			if(listOfCompanies.get(i).getText().equalsIgnoreCase("Oasis Securities")) {
//			System.out.println(currentPriceOfAllCompanies.get(i).getText());
			  
		List<WebElement> singleCompany=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td"));
		for (int j = 0; j<singleCompany.size(); j++) {
		System.out.println(singleCompany.get(j).getText());
		
		}
		
	}

}
