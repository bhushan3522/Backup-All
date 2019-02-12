package TP;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandles {

	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[text()=\"Good PopUp #1\"]")).click();
		
		//getting all the opened windows
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println("Parent window is :"+parentWindow + " Child window is :"+childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.close();
	}
}
