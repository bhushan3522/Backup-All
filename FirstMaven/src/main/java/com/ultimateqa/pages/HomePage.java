package com.ultimateqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ultimateqa.baseclass.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//a[@href=\"/enrollments\"]")
	WebElement MyDashboard;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSuccessfulLogin()
	{
		return MyDashboard.isDisplayed();
	}
	
}

