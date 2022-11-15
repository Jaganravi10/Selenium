package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//1. Get XY position
		WebElement getPosition=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xypoint=getPosition.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is"+ xValue+"Y value is"+ yValue);
		
		//2. Get the color	
		WebElement getColor=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
		String buttonColor=getColor.getCssValue("color");
		System.out.println("Button color is:"+buttonColor);
		
		//3. Get size and height
		WebElement getSizeHeight=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int height=getSizeHeight.getSize().getHeight();
		int width=getSizeHeight.getSize().getWidth();
		System.out.println("Height is :"+ height +"Width is :"+ width);
			
	}

}
