package com.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		WebElement daylist=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select day=new Select(daylist);
		day.selectByValue("28");
		WebElement monthlist=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select month=new Select(monthlist);
		month.selectByIndex(10);
		List<WebElement>allmonths=month.getOptions();
		System.out.println(allmonths.size());
		for(int m=0;m<allmonths.size();m++) {
			System.out.println(allmonths.get(m).getText());
		}
	
		WebElement yearlist=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select year=new Select(yearlist);
		year.selectByVisibleText("1990");
		WebElement city=driver.findElement(By.xpath("//select[contains(@name,'city')]"));
		Select cityname=new Select(city);
		cityname.selectByVisibleText("Chennai");
		WebElement emailaddress=driver.findElement(By.xpath("//input[contains(@maxlength,'100')]"));
		emailaddress.sendKeys("rjagan0808@gmail.com");
		
		

		
		
		
		
		
		
		
		
	
		
		
		 
		


	}

}
