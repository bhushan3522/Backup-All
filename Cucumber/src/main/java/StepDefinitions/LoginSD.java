package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD {
	
	WebDriver driver;
	
	@Given("^user has launched google chrome browser$")
	public void user_has_launched_google_chrome_browser() {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@When("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		driver.get("https://www.crmpro.com/");
	}

	@Then("^user will enter \"([^\"]*)\" and \"([^\"]*)\" and hit enter button$")
	public void user_will_enter_and_and_hit_enter_button(String arg1, String arg2){
	
		
	}

	
	@Then("^user will be navigated to home page$")
	public void user_will_be_navigated_to_home_page() {
	}

	@Then("^verify loggedin username$")
	public void verify_loggedin_username() {
	}

	@Then("^logout$")
	public void logout() throws Throwable {
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	}

	
}
