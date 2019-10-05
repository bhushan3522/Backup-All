package Practice_Sep15;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(3);
		sel.selectByValue("INDIA");
		sel.selectByVisibleText("AUSTRALIA");
		
		List<WebElement>countries = sel.getOptions();
		
		Iterator<WebElement>it = countries.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
	}

}
