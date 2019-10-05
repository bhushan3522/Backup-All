package Practice_Aug_28;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators_MMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();

		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href=\"//www.makemytrip.com/hotels/\"]")).click();
		
		WebElement city = driver.findElement(By.xpath("//input[@id=\"city\"]"));
		city.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input"
				+ "[@placeholder=\"Enter city/ Hotel/ Area/ Building\"]"))));
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter city/ Hotel/ Area/ Building\"]")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//span[contains(text(),\"Mumbai, India\")]")).click();
		
	}

}
