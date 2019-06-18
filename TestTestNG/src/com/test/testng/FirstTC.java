package com.test.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTC {
	
	String expectedTitle = "Google1";
	WebDriver driver;
	
	
	@BeforeTest
	public void BTest()
	{
		System.out.println("Will be executed before test");
	}
	
	@AfterTest
	public void ATest()
	{
		System.out.println("Will be executed after test");
	}
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
	}
	
	@Test
	public void TestCase1()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"expected title is "+expectedTitle+" whereas actual is "+actualTitle);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
