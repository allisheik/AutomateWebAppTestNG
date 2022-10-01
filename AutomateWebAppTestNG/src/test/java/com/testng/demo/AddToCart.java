package com.testng.demo;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart {
	
	WebDriver driver;
	@Test
	public void addtocart() {
		
		driver.get("https://www.amazon.in/dp/B09QSBXK96?m=A1K6XQ7KUWCZYH&ref=clp_pc_a_A7FSYCO3GZW4N");
		driver.findElement(By.cssSelector("#add-to-cart-button")).submit();
		
		
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