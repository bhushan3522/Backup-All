package Practice_Sep15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/");
		
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("bhushan3522");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("tu3f1011032"+Keys.ENTER);
	
		
	}

}
