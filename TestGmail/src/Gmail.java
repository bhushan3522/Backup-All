import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.navigate().to("http://www.gmail.com");
		
		driver.findElement(By.xpath("//a[@href='https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[text()='More options']")).click();
		
		
	}

}
