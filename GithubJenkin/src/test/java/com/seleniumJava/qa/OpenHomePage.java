package com.seleniumJava.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenHomePage {
	
	
	public static WebDriver driver;
	
	
	@Test
	public void HomePageTitle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdkamal/Desktop/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://chase.com");
		
		System.out.println("The homepage Title is :" + driver.getTitle());
		
		
		Thread.sleep(10);
		
		driver.quit();
		
	}

}
