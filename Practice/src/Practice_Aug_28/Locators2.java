package Practice_Aug_28;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text()=\"SIGN-ON\"]")).click();		
		System.out.println("Title of page is : "+driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("hi");
		driver.findElement(By.xpath("//input[@type=\"password\"][@name=\"password\"]")).sendKeys("pass");
		
		driver.findElement(By.xpath("//a[@href=\"mercuryunderconst.php\"][text()=\"SUPPORT\"]")).click();
		System.out.println("Title of page is : "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(@href,\"welcome\")][img]")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a[starts-with(@href,\"mercury\")]"));
		System.out.println("Number of links startig with Mercury is : " +links.size());
		
		
		
	}

}
