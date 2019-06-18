package com.udemy.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		
		Boolean firstCBSel = driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected();
		Assert.assertTrue(firstCBSel);
		
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		
		Boolean secondCBSel = driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected();
		Assert.assertFalse(secondCBSel);
		
		driver.close();
	}

}
