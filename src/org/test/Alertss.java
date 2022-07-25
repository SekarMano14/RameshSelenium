package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
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

public class Alertss {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// System.setProperty("webdriver.chrome.driver",

		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simpleAlert.click();

		// Handle the alert
		Alert sa = driver.switchTo().alert();
		String text = sa.getText();
		System.out.println(text);
		sa.accept();

		// confirm Alert
		WebElement btnConform = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		btnConform.click();

		WebElement conformAlert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		conformAlert.click();
		
//		switch to alert
		Alert ca = driver.switchTo().alert();
		System.out.println(ca.getText());
		ca.dismiss();
		
//		prompt alert
		WebElement btnPrompt = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		btnPrompt.click();
		
		WebElement prompAlert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompAlert.click();
		
//		switch to alert
		Alert pr = driver.switchTo().alert();
		pr.sendKeys("Manoj");
		System.out.println(pr.getText());
		pr.accept();

	}

}
