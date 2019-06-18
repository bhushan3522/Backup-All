package com.MavenSample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGoogle {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void open() throws InterruptedException
	{
		driver.get("http://www.google.com");
		Thread.sleep(5000);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
