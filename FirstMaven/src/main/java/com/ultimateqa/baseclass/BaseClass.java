package com.ultimateqa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass()
	{
		 try 
		 {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("E:\\Projects\\FirstMaven\\src\\main\\java\\com\\"
					+ "ultimateqa\\config\\config.properties");
			prop.load(fis);
		 }
		 catch(FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	}
	public static void inititalize()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
}
