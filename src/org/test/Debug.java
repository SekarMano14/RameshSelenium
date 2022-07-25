package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreate.click();
		
//		Thread.sleep(5000);  //static wait
		
		//dynamic wait
////		implicit wait
//		Options op = driver.manage();
//		Timeouts tt = op.timeouts();
//		tt.implicitlyWait(50, TimeUnit.SECONDS);
//		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//selenium 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//selenium 4
		
		WebElement txtFirstname = driver.findElement(By.name("firstname"));
		txtFirstname.sendKeys("Manoj");
		
		WebElement txtLastname = driver.findElement(By.name("lastname"));
		txtLastname.sendKeys("Kumar");
		
		WebElement txtMobile = driver.findElement(By.name("reg_email__"));
		txtMobile.sendKeys("8015572746");
		
		
		WebElement txtPassword = driver.findElement(By.name("reg_passwd__"));
		txtPassword.sendKeys("manoj212342@");
		
		WebElement btnSignup = driver.findElement(By.name("websubmit"));
		btnSignup.click();
		
		
	}

}
