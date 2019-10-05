package Practice_Aug_28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//get locator by ID
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("THIS IS TEST");
		
		//get locator by NAME
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("THIS IS TEST");
		
		//get locators by tagname
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("No of links present in page is : "+links.size());
		
		//driver.findElement(By.xpath("//input[@id=\"pass\"]//following::input[@name=\"firstname\"]")).sendKeys("ABC");
		
		//get locator by Partial Link Text
		WebElement pLinkText = driver.findElement(By.partialLinkText("Forgotten"));
		pLinkText.click();
		
		//navigate to login page
		driver.navigate().back();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;	
		//js.executeScript("args[0].sendKeys(\"firstname\");",driver.findElement(By.cssSelector("input[id=\"u_0_v\"]")));
		
		
		//using css selector
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("firstname");
		driver.findElement(By.cssSelector("#pass")).clear();
		
		
		driver.navigate().to("http://www.gsmarena.com");
		driver.findElement(By.cssSelector("input[type=\"text\"][placeholder=\"Search\"]")).sendKeys("abc");
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		
		
		
	}

}
