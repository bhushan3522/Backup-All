package testBankDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.demo.guru99.com/V4/");
		
		WebElement UserId = driver.findElement(By.xpath("//input[@name='uid']"));
		UserId.sendKeys("mngr128724");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("evubysA");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

}
