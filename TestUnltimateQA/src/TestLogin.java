import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

	static WebDriver driver;
	
	@DataProvider(name = "DataGenerator")
	public Object[][] TestData() throws Exception
	{
		 return ReadExcelData.ReadExcel();
	}
	
	@BeforeMethod
	public static void setup()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://courses.ultimateqa.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider = "DataGenerator")
	public void TestLogIn(String UserName, String Pwd)
	{
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
		WebElement Email = driver.findElement(By.id("user_email"));
		WebElement Password = driver.findElement(By.id("user_password"));
		
		Email.sendKeys(UserName);
		Password.sendKeys(Pwd);
		
		driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Sign in\"]")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
