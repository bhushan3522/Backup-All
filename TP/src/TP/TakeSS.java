package TP;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jna.platform.FileUtils;

public class TakeSS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:\\www.google.com");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File ss = screenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("E:\\Projects\\TP\\src\\TP\\ss1.jpeg"));
	}

}
