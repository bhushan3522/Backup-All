package com.screenshot.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.screenshot.base.TestBase;
import com.screenshot.util.CustomListener;

@Listeners(CustomListener.class)

public class TestScreenshot extends TestBase{
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	
	@Test
	public void failed()
	{
		Assert.assertEquals("a", "b");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
