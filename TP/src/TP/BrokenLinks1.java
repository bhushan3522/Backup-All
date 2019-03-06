package TP;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
	
		driver.get("https://gsmarena.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		links.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of all links is :"+links.size());
		
		ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i =0; i < links.size();i++)
		{
			if(links.get(0).getAttribute("href") != null)
				activeLinks.add(links.get(i));
		}
		
		for(int j = 0; j < activeLinks.size();j++)
		{
			HttpURLConnection conn = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			conn.connect();
			String response = conn.getResponseMessage();
			System.out.println(activeLinks.get(j).getAttribute("href")+"----"+ response);
			conn.disconnect();
		
		
		}
		
		
	}

}
