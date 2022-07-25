package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// Browser launch
		// configuration browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sekar\\eclipse-workspace\\SeleniumRamesh_Jun22\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		// Url launch
//		driver.get("https://www.facebook.com/");
//		
//		By using Id
////		By id = By.id("email");
//		WebElement txtUsername = driver.findElement(By.id("email"));
//		txtUsername.sendKeys("manoj@gmail.com");
//		
//		WebElement txtPassword = driver.findElement(By.id("pass"));
//		txtPassword.sendKeys("0987654");
//		
		
//		By using name
		
//		By id = By.id("email");
//		WebElement txtUsername = driver.findElement(By.name("email"));
//		txtUsername.sendKeys("manoj@gmail.com");
//		
//		WebElement txtPassword = driver.findElement(By.name("pass"));
//		txtPassword.sendKeys("0987654");
//		
//		
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
		
//		By using classname
//		
//		WebElement txtUsername = driver.findElement(By.className("inputtext"));
//		txtUsername.sendKeys("manoj@gmail.com");
//		
//		WebElement txtPassword = driver.findElement(By.className("inputtext"));
//		txtPassword.sendKeys("0987654");
//		
////		
////		WebElement btnLogin = driver.findElement(By.name("login"));
////		btnLogin.click();
//		
		
////		xpath
//		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
//		txtUsername.sendKeys("manoj@gmail.com");
//		
//		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
//		txtPassword.sendKeys("0987654");
//		
//		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
//		btnLogin.click();
//		
////		xpath with multiple locator--using index
//		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		btnCreate.click();
//		
////		get  mutiple webelements at a time
//		List<WebElement> button = driver.findElements(By.xpath("//a[@role='button']"));
////		 0   1   2
////		[b1, b2, b3]
//		
//		WebElement create = button.get(1);
//		create.click();
		
		
//		xpath with text
		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement linkCreate = driver.findElement(By.xpath("//a[text()='Create a Page']"));
//		linkCreate.click();
		
		String text = linkCreate.getText();
		System.out.println(text);
		
		WebElement txtCreate = driver.findElement(By.xpath("//div[text()=' for a celebrity, brand or business.']"));
		String text2 = txtCreate.getText();
		System.out.println(text2);
		
//		xpath-text contains
		WebElement txtFacebook = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text3 = txtFacebook.getText();
		System.out.println(text3);
		
//		xpath - attribute contains
		WebElement txtUsername = driver.findElement(By.xpath("//input[contains(@id,'em')]"));
		txtUsername.sendKeys("manoj@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[contains(@id,'pa')]"));
		txtPassword.sendKeys("987654");

		
//		getAttribute --get attribute value of current webelement
		String atUser = txtUsername.getAttribute("value");
		System.out.println(atUser);
		
		String atPass = txtPassword.getAttribute("value");
		System.out.println(atPass);
		
//		using getattribute can get text also
		String tt = txtFacebook.getAttribute("innerText");
		System.out.println(tt);
	}
	
}
