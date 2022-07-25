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

public class Dropdown2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// System.setProperty("webdriver.chrome.driver",

		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement drdMulti = driver.findElement(By.name("selenium_commands"));
		
		Select s= new Select(drdMulti);
		
		boolean mt = s.isMultiple();
		System.out.println("Is Multiple........"+mt);
		
//		select options
//		index
		s.selectByIndex(2);
		s.selectByIndex(4);
//		value
//		s.selectByValue("Browser Commands");  there is no value
//		by text
		s.selectByVisibleText("Browser Commands");
		
		
//		get all options
		List<WebElement> op = s.getOptions();
		System.out.println("Options Size..."+op.size());
		
//		get particlar option
		WebElement op2 = op.get(2);
//		op2.click();
		System.out.println(op2.getText());
		System.out.println("=========All Options===============");
//print all option
//		Normal for loop
		System.out.println("Normal for  Loop0");
		for (int i = 0; i < op.size(); i++) {
			WebElement eachoption = op.get(i);
			System.out.println(eachoption.getText());
		}
		
//		Enhanced for loop
		System.out.println("Enhanced for loop");
		for (WebElement each : op) {
			System.out.println(each.getText());
		}

		System.out.println("=========All Only Selected Options===============");

//		get all selected option
		List<WebElement> allSelect = s.getAllSelectedOptions();
		for (WebElement all : allSelect) {
			System.out.println(all.getText());
		}
		System.out.println("=========First Selected Options===============");
//		get first select option
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		
//		deselect the option
//		index
		s.deselectByIndex(4);
//		value
//		s.deselectByValue("Browser Commands");  there is no value
//		text
		s.deselectByVisibleText("Switch Commands");
		
		Thread.sleep(3000);
//		deselect all
		s.deselectAll();
		Thread.sleep(3000);
		
//		select all options
//		Index
		for (int i = 0; i < op.size(); i++) {
			s.selectByIndex(i);
		}
		Thread.sleep(3000);
		s.deselectAll();
		Thread.sleep(3000);
		
//		/select by value
//		for (int i = 0; i < args.length; i++) {
//			WebElement eachOption = op.get(i);
//			String value = eachOption.getAttribute("value");
//			s.selectByValue(value);
//		}
		
//		text
		for (WebElement each : op) {
			String text = each.getText();
			s.selectByVisibleText(text);
		}
		Thread.sleep(3000);
		s.deselectAll();
		Thread.sleep(3000);
		
		drdMulti.sendKeys("Switch Commands");
		
	}

}
