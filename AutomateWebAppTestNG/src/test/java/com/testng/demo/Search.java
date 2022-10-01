package com.testng.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search {
	
	WebDriver driver;
	@Test
	public void search() {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("simplilearn");
		driver.findElement(By.name("btnK")).submit();

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