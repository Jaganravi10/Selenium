package com.Selenium.Practice;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		
		//Takes screenshot wont work if Alert is available in the page
		//Screenshot using selenium
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile =new File("C:\\Users\\Admin\\Downloads\\sample.png");
		FileHandler.copy(screenshotFile, destinationFile);
		
		//Screenshot using java Robot class
		Robot screenshotAlternate=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source=screenshotAlternate.createScreenCapture(rectangle);
		File destination= new File("C:\\Users\\Admin\\Downloads\\robot.png");
		ImageIO.write(source, "png", destination);
		
	}

}
