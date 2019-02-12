package com.freeCRM.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeCRM.pages.LoginPage;
import com.freeCRM.testBase.TestBaseClass;
import com.freeCRM.utilities.Utility;

public class LoginPageTest extends TestBaseClass{
	
	LoginPage loginPage;
	
	public LoginPageTest() throws Exception
	{
		super();
	}

	@BeforeMethod
	public void start() throws Exception
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void testLoginPageTitle()
	{
		String actualTitle = loginPage.getTitle();
		
		Assert.assertEquals(actualTitle, Utility.loginPageTitle);
	}
	
	@Test(priority=2)
	public void testCRMLogo()
	{
		Assert.assertEquals(loginPage.validateCRMLogo(), true);
	}
	
	@Test(priority=3)
	public void testMotto()
	{
		Assert.assertEquals(loginPage.validateMotto(), Utility.loginPageMotto);
	}
}
