package TP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name = 'username']"));
		UserName.sendKeys("bhushan3522");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
		Password.sendKeys("tu3f1011032");
		
		driver.switchTo().frame("intercom-borderless-frame");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class = 'intercom-chat-card intercom-chat-"
				+ "card-borderless intercom-chat-card-with-avatar']"))).perform();
		
		driver.findElement(By.xpath("//div[@class=\"intercom-borderless-dismiss-button\"]")).click();
		
		driver.findElement(By.xpath("//input[@type= 'submit' and @value = 'Login']")).click();
		

	}

}
