package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// System.setProperty("webdriver.chrome.driver",

		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtUsername = driver.findElement(By.id("email"));
//		txtUsername.sendKeys("java");

		Actions a = new Actions(driver);
//		a.doubleClick(txtUsername).perform();

		// a.contextClick(txtUsername).perform();

		Robot r = new Robot();
		

		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		//
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		//
		//
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		//
		WebElement txtPassword = driver.findElement(By.id("pass"));
		// a.contextClick(txtPassword).perform();
		// for (int i = 0; i < 4; i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// }
		//
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

//		Thread.sleep(10000);
//		// using shortcuts
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_C);
//
//		// next filed tab
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
////		paste
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
//		mano--MANO
		a.keyDown(Keys.SHIFT).sendKeys(txtUsername, "mano").keyUp(Keys.SHIFT).perform();

	}

}
