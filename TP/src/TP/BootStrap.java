package TP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BootStrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
		
	}

}
