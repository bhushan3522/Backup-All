package com.freeCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeCRM.testBase.TestBaseClass;

public class LoginPage extends TestBaseClass{
	
	@FindBy(xpath="//input[@type = \"text\" and @name=\"username\"]")
	WebElement userName;
	
	@FindBy(xpath="//input[@type = \"password\" and @name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\" and @value =\"Login\"]")
	WebElement btnLogin;
	
	public LoginPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	

}
