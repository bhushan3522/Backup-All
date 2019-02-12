package testBankDemo;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogIn4 {

	private static WebDriver driver;
	
	@DataProvider(name = "Day4")
	public Object[][] testdata() throws IOException
	{
		String filePath = System.getProperty("user.dir")+"\\src\\testBankDemo";
		return ReadExcelFile.readExcel(filePath, "TestData.xlsx","Sheet1");
	}
	
	@BeforeMethod
	public static void setup() 
	{
		//driver = null;
		
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
		driver.get(Util.base_url);
	}	

	
	@Test(dataProvider = "Day4")
	public void TestLogin4(String UserName, String Password) throws InterruptedException
	{
		//Passing username
		WebElement UserId = driver.findElement(By.xpath("//input[@name='uid']"));
		UserId.sendKeys(UserName);
		
		//Passing password
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys(Password);
		
		//performing login
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		try{ 
		    
	       	Alert alt = driver.switchTo().alert();
			String actualBoxtitle = alt.getText(); // get content of the Alter Message
			alt.accept();
			assertEquals(actualBoxtitle, Util.EXPECT_ERROR);
		}    
	    catch (NoAlertPresentException Ex){ 
	    	Thread.sleep(2000);
	    	String actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			assertEquals(actualTitle, Util.EXPECT_TITLE);
			
        }
	}
	@AfterMethod
	public void destroyBrowser()
	{
		driver.quit();
	}
	
}
