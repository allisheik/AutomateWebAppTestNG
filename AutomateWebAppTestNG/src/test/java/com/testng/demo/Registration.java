package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
	
	WebDriver driver;
	@Test
	public void register() {
		
		driver.get("https://www.codechef.com/signup");
		driver.findElement(By.id("edit-username")).sendKeys("allisheik26");
		driver.findElement(By.id("edit-mail")).sendKeys("alli62@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Alli@1231237");
		driver.findElement(By.name("geolocation")).sendKeys("India");
		driver.findElement(By.name("code_of_conduct")).click();
		driver.findElement(By.id("edit-submit-button")).click();
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SimpliLearn\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
	
	
}