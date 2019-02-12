package com.ultimateqa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ultimateqa.baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(id = "user_password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type=\"submit\" and @value=\"Sign in\"]")
	WebElement signIn;
	
	@FindBy(xpath = "//div[@class=\"footer-copyright\"]")
	WebElement footer;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean validatePageFooter()
	{
		return footer.isDisplayed();
	}
	
	public HomePage validateLoginPage(String eid, String pwd)
	{
		email.sendKeys(eid);
		password.sendKeys(pwd);
		signIn.click();
		
		return new HomePage();
	}
}

