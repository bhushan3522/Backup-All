package TP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimePass {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.chord("hi",Keys.TAB));
		System.out.println("done");
		
		//driver.quit();

	}
		

}
