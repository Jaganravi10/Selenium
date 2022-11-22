package com.Selenium.Practice;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDownExample {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		/*executor.executeScript("window.scroll(0,450)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-450)", "");*/
		
		// Go to bottom of page		
		/*executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,0)", "");*/
		
		// Go to a specific element position
		WebElement chart=driver.findElement(By.xpath("//canvas[@id='chart']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", chart);
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Robot screenshot= new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle =new Rectangle(screenSize);
		BufferedImage image=screenshot.createScreenCapture(rectangle);
		File destination= new File("C:\\Users\\Admin\\Downloads\\robot.png");
		ImageIO.write(image, "png", destination);
		

	}

}
