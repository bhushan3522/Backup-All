package testGuruDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//open website
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		
		//getiing email id using id
		WebElement Email_Id = driver.findElement(By.id("email"));

		//sending value to email id
		Email_Id.sendKeys("bhushan3522@gmail.com");
		
		//getting password using name
		WebElement pwd = driver.findElement(By.name("passwd"));
		
		//sending password
		pwd.sendKeys("abc");
		
		//clearing values
		//Email_Id.clear();
		//pwd.clear();
		
		//submit
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		
		//click on submit
		submit.click();
	}

}
