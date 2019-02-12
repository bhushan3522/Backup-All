package testGuruDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRadioCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value=\"Option 1\"]"));
		radio1.click();
		
		WebElement radio2 = driver.findElement(By.xpath("//input[@value=\"Option 2\"]"));
		radio2.click();
		
		WebElement radio3 = driver.findElement(By.xpath("//input[@value=\"Option 3\"]"));
		radio3.click();
		
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		System.out.println(radio3.isSelected());
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@name=\"webform\"][@value=\"checkbox1\"]"));
		Checkbox1.click();
		
		WebElement Checkbox2 = driver.findElement(By.xpath("//input[@name=\"webform\"][@value=\"checkbox2\"]"));
		Checkbox2.click();
		
		WebElement Checkbox3 = driver.findElement(By.xpath("//input[@name=\"webform\"][@value=\"checkbox3\"]"));
		Checkbox3.click();
		
		System.out.println(Checkbox1.isSelected());
		System.out.println(Checkbox2.isSelected());
		System.out.println(Checkbox3.isSelected());
	}

}
