package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "./\\Drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.manage().window().maximize();
		//
		//
		// WebElement mveCourses =
		// driver.findElement(By.xpath("//div[@title='Courses']"));
		//
		// Actions a=new Actions(driver);
		//
		//// a.moveToElement(mveCourses).perform();
		//
		// WebElement mveOracle =
		// driver.findElement(By.xpath("//div[@title='Oracle']"));
		//// a.moveToElement(mveOracle).perform();
		//
		// WebElement linkSql = driver.findElement(By.xpath("//span[text()='SQL
		// Certification Training']"));
		//// a.click(linkSql).perform();
		//
		// a.moveToElement(mveCourses).moveToElement(mveOracle).click(linkSql).build().perform();

		// drag and drop
		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		WebElement srcBank = driver.findElement(By.id("credit2"));
		WebElement desBank = driver.findElement(By.id("bank"));

		Actions a = new Actions(driver);
//		a.dragAndDrop(srcBank, desBank).perform();
		
//		anther way
		a.clickAndHold(srcBank).moveToElement(desBank).release().build().perform();
		a.clickAndHold(srcBank).release(desBank).perform();
	}

}
