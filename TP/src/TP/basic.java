package TP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		/*
		//WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		
		driver.findElement(By.xpath("//input[@value=\"Option 1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Option 2\"]")).click();
		boolean a = driver.findElement(By.xpath("//input[@value=\"Option 1\"]")).isSelected();
		System.out.println(a);
		
		driver.findElement(By.xpath("//input[@value=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"checkbox2\"]")).click();
		
		boolean b = driver.findElement(By.xpath("//input[@value=\"checkbox2\"]")).isSelected();
		boolean c = driver.findElement(By.xpath("//input[@value=\"checkbox1\"]")).isSelected();
		
		System.out.println(b+""+c);
		
		
		WebElement dd = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		Select sel = new Select(dd);
		sel.selectByIndex(0);
		sel.selectByValue("INDIA");
		sel.selectByVisibleText("BHUTAN");
		
		System.out.println(sel.isMultiple());
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@href=\"index.php\" and text()='Home']"))).build().perform();
		
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		alert1.accept();
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		*/
	
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
		Set<String> popups = driver.getWindowHandles();
		Iterator<String> it = popups.iterator();
		String main = it.next();
		String child = it.next();
		
		driver.switchTo().window(main);
		
	
	
	
	}

}
