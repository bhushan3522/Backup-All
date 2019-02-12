package SubReddit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Follow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.reddit.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"log in\"]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"https://www.reddit.com/login\"]")));
		
		driver.findElement(By.xpath("//input[@id=\"loginUsername\"]")).sendKeys("bhushan3522");

		driver.findElement(By.xpath("//input[@id=\"loginPassword\"]")).sendKeys("tu3f1011032");
		
		driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
		
		driver.switchTo().parentFrame();
		
		boolean b = driver.findElement(By.xpath("//button[@id=\"USER_DROPDOWN_ID\"]")).isDisplayed();
		System.out.println(b);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@role=\"navigation\"]")).click();
		
		Thread.sleep(5000);
		
		boolean b1 = driver.findElement(By.xpath("//div[text()=\"subscriptions\"]")).isDisplayed();
		
		System.out.println(b1);
	}

}
