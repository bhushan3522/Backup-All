package com.udemy.exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountCB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		List<WebElement> CBCount = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of CheckBoxes are : "+CBCount.size());
		
		driver.close();
	}

}
