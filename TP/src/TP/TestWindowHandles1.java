package TP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(),\"#2\")]")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		String mainWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.close();
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
