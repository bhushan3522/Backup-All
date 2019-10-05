package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD {

	WebDriver driver;
	
	@Given("^user has launched google chrome browser$")
	public void user_has_launched_google_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("^user is already on login page$")
	public void user_is_already_on_login_page()
	{
		driver.get("https://www.crmpro.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Then("^user will enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_enter_username_and_password(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user will click on login button$")
	public void user_will_click_on_login_button()
	{
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.switchTo().frame(4);
		WebElement closePopUp = driver.findElement(By.xpath("//div[@id=\"tawkchat-message-preview-close\"]//div"));
		
		wait.until(ExpectedConditions.elementToBeClickable(closePopUp));
		closePopUp.click();
		
		driver.switchTo().parentFrame();
		
		loginBtn.click();
		
	}
	
	@Then("^user will be navigated to home page$")
	public void user_will_be_navigated_to_home_page()
	{
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name=\"mainpanel\"]")));
		
		String user = driver.findElement(By.xpath("//div[@id=\"dispAlertMessage\"]/"
				+ "following-sibling::table//td[contains(text(),\"Bhushan\")]")).getText();
		
		Assert.assertEquals(user, "  User: Bhushan Jagtap");
	}
	
}
