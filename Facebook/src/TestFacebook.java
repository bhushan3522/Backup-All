import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//maximize browser
		//driver.manage().window().maximize();
		
		//navigate to URL
		//driver.get("http://www.facebook.com");
		driver.navigate().to("http://www.facebook.com");
		
		
		//first name on registration page
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Bhushan");
		
		//surname on registration page
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).sendKeys("Jagtap");
		
		//select gender which is a radio button
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).click();
		
		//select date(Dropdown)
		Select  date = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		date.selectByVisibleText("16");
		
		//select month(dropdown)
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByValue("10");
		
		//select year(dropdown)
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		year.selectByIndex(27);
		
		
		//click on hyperlink
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		//closes browser
		//driver.quit();
		
	}

}
