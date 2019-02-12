package testSeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateSeleniumEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E://Selenium//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//Go to Website
		driver.navigate().to("http://www.seleniumeasy.com/test/");
		
		//Click on 'Input Forms' Drodpdown
		driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul[1]/li[1]/a")).click();
		
		//Click on 'Simple Form' option
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		
		//Enter message
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hi, This is Bhushan");
		
		//Click on 'Show Message' button
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		
		//get displayed message
		String message = driver.findElement(By.xpath(".//*[@id='display']")).getText();
		System.out.println(message);
		
		//two input fields
		//Enter a
		driver.findElement(By.xpath(".//*[@id='sum1']")).sendKeys("5");
		
		//Enter b
		driver.findElement(By.xpath(".//*[@id='sum2']")).sendKeys("10");
	    
		//Enter Get Total
		driver.findElement(By.xpath(".//*[@id='gettotal']/button")).click();
		
		//Fetch total
		String result = driver.findElement(By.xpath(".//*[@id='displayvalue']")).getText();
		System.out.println(result);
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Click on Checkbox Demo from dropdown
		driver.findElement(By.xpath("./basic-checkbox-demo.html")).click();
		
		
	}

}
