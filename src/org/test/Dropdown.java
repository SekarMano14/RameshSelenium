package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// System.setProperty("webdriver.chrome.driver",

		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreate.click();
		
		
		WebElement drdMonth = driver.findElement(By.id("month"));
		Select s=new Select(drdMonth);
		
//		selecet the options
//		by index
		s.selectByIndex(4);
		
//		by value
		s.selectByValue("6");
		
//		by text
		s.selectByVisibleText("Nov");
		
//		single or multiple
		boolean mt = s.isMultiple();
		System.out.println(mt);

		
//		get all options
		List<WebElement> op = s.getOptions();
		
//		/options size
		System.out.println("Options size...."+op.size());
		
//		get parrticular option
		WebElement op2 = op.get(2);
//		print option
		String kl = op2.getText();
		System.out.println(kl);
		
//		print all options
//		normal for loop---index
		System.out.println("---Normal for loop----");
		for (int i = 0; i < op.size(); i++) {
			WebElement eachOption = op.get(i);
			String text = eachOption.getText();
			System.out.println(text);
		}
		
//		Enhanced for loop--value
		System.out.println("-----Enhanced for loop------");
//		for(Datatype var:storedvar) { statements}
		for(WebElement eachOption:op) {
			System.out.println(eachOption.getText());
		}
		Thread.sleep(3000);
//		select date
		WebElement drdDay = driver.findElement(By.id("day"));
		Select date=new Select(drdDay);
		date.selectByValue("4");
		
		Thread.sleep(3000);
//		select year
		WebElement drdYear = driver.findElement(By.id("year"));
		Select syear= new Select(drdYear);
		syear.selectByValue("1999");
		
		Thread.sleep(3000);
//		select month
		drdMonth.sendKeys("Dec");

	}

}
