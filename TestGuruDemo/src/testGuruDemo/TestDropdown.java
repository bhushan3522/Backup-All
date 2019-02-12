package testGuruDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		
		Select Country = new Select(driver.findElement(By.name("country")));
		
		//Country.selectByIndex(10);
		Country.selectByValue("INDIA");
		//Country.selectByVisibleText("CHINA");
		
	}

}
