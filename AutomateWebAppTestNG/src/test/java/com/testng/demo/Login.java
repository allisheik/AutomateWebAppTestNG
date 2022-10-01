package com.testng.demo;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	@Test
	public void login() {
		
		driver.get("https://login.ezoic.com/");
		driver.findElement(By.name("email")).sendKeys("alli@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Alli@123123");
		driver.findElement(By.id("login-button")).submit();
		
		
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