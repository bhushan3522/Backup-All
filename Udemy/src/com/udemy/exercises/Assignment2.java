package com.udemy.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//td[@data-month=\"5\"]/a[text()=\"13\"]")).click();
		
		Select sel1 = new Select(driver.findElement(By.id("Adults")));
		sel1.selectByIndex(0);
		
		Select sel2 = new Select(driver.findElement(By.id("Childrens")));
		sel2.selectByValue("1");
		
		Select sel3 = new Select(driver.findElement(By.id("Infants")));
		sel3.selectByVisibleText("1");
		
		//click on link to expand
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		//airline name
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Jet");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		//print text
		String errorText = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errorText);
		
		driver.close();
				


	}

}
