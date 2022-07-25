package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// Browser launch
		// configuration browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sekar\\eclipse-workspace\\SeleniumRamesh_Jun22\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// Url launch
		driver.get("https://www.facebook.com/");
		
//		url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		title
		String title = driver.getTitle();
		System.out.println(title);
		
//		close browser
		driver.quit();

	}
}
