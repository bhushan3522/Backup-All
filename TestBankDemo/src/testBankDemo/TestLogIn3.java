package testBankDemo;

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

public class TestLogIn3 {


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
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		String filePath = System.getProperty("user.dir")+"\\src\\testBankDemo";
		String credentials[][] = ReadExcelFile.readExcel(filePath,"TestData.xlsx","Sheet1");
		String actualBoxtitle;
		String actualTitle;
		for(int i = 1; i < credentials.length; i++)
		{
				//Launching firefox driver
				setup();
				
				//loading URL
				driver.get(Util.base_url);
			
				//Passing username
				WebElement UserId = driver.findElement(By.xpath("//input[@name='uid']"));
				UserId.sendKeys(credentials[i][0]);
				
				//Passing password
				WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
				pwd.sendKeys(credentials[i][1]);
				
				//performing login
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
				try{ 
				    
			       	Alert alt = driver.switchTo().alert();
					actualBoxtitle = alt.getText(); // get content of the Alter Message
					alt.accept();
					if (actualBoxtitle.contains(Util.EXPECT_ERROR)) { // Compare Error Text with Expected Error Value
					    System.out.println("Test case SS[" + i + "]: Passed"); 
					} else {
					    System.out.println("Test case SS[" + i + "]: Failed");
					}
				}    
			    catch (NoAlertPresentException Ex){ 
			    	Thread.sleep(2000);
			    	actualTitle = driver.getTitle();
					// On Successful login compare Actual Page Title with Expected Title
					if (actualTitle.contains(Util.EXPECT_TITLE)) {
					    System.out.println("Test case SS[" + i + "]: Passed");
					} else {
					    System.out.println("Test case SS[" + i + "]: Failed");
					}
					
		        }
				
				driver.quit();	
		}
	}
	
}
