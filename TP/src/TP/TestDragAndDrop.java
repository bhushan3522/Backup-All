package TP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		Actions action = new Actions(driver);
		
		WebElement account = driver.findElement(By.xpath("//a[text()=\" BANK \"]"));
		WebElement amount = driver.findElement(By.xpath("//div[@id=\"products\"]/div/ul/li[2]"));
		
		WebElement account_dest = driver.findElement(By.xpath("//ol[@id=\"bank\"]"));
		WebElement amount_dest = driver.findElement(By.xpath("//ol[@id=\"amt7\"]"));
		
		action.clickAndHold(account).moveToElement(account_dest).release().build().perform();
		action.clickAndHold(amount).moveToElement(amount_dest).release().build().perform();

	}

}
