package testBankDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestLogIn2 {

	static WebDriver driver;
	public static void setup() 
	{
		
		//Setting firefox binaries
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary(Util.ff_loc);
		
		//Creating new firefox profile
		FirefoxProfile ffprofile = new FirefoxProfile();
		options.setProfile(ffprofile);
		
		//gecko driver
		System.setProperty("webdriver.gecko.driver", Util.dirver_loc);
		driver = new FirefoxDriver(options);
		
		//adding 10 seconds wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launching firefox driver
		setup();
		
		//loading URL
		driver.get(Util.base_url);
		
		//Passing username
		WebElement UserId = driver.findElement(By.xpath("//input[@name='uid']"));
		UserId.sendKeys(Util.UserName);
		
		//Passing password
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys(Util.pwd);
		
		//performing login
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		Thread.sleep(2000);
		String page_tile = driver.getTitle();
		
		if (page_tile.contains("Guru99 Bank Manager HomePage")) 
		{
		    System.out.println("Test case: Passed");
		} 
		else 
		{
		    System.out.println("Test case : Failed");
		}
	}

}
