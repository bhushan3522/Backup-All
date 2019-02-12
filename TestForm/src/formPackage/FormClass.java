package formPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormClass {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		//Go to URL
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//enter first name in the text box
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhushan");
		
		//enter last name in the text box
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jagtap");
		
		//Select gender
		driver.findElement(By.id("sex-0")).click();
		
		//Select experience
		driver.findElement(By.xpath("//input[@name='exp'][@value='3']")).click();
		
		//Select date
		driver.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("13/01/2018");
		
		//Select profession
		driver.findElement(By.xpath("//input[@name='profession'][@value='Automation Tester']")).click();
		
		//Upload a file
		driver.findElement(By.xpath(".//*[@id='photo']")).sendKeys("C:\\Users\\Bhushan\\Pictures\\maxresdefault.jpg");
		
		//Select Automation tool
		driver.findElement(By.xpath("//input[@name='tool'][contains(@value,'Webdriver')]")).click();
		
		//Select element from dropdown
		Select continent = new Select(driver.findElement(By.xpath(".//*[@id='continents']")));
		continent.selectByVisibleText("Antartica");
		
		//select command
		Select commands = new Select(driver.findElement(By.xpath(".//*[@id='selenium_commands']")));
		commands.selectByVisibleText("Switch Commands");
		
		//driver.quit();
	}
	

}
