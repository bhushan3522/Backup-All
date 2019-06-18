package TP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> noOfCols = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		System.out.println("Number of columns are : "+noOfCols.size());

		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr/td[1]"));
		System.out.println("Number of rows are : "+noOfRows.size());
		
		int rowNum = 25;
		int colNum = 1;
		
		String beforeXpath = "//table[@class='dataTable']//tbody//";
		String afterXpath = "tr["+rowNum+"]//td["+colNum+"]";
	
		String value = driver.findElement(By.xpath(beforeXpath.concat(afterXpath))).getText();
		System.out.println("========================Value is==================>>>>>"+value);
		
		//FInding maximum value
		
		double maxVal = Double.parseDouble(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]/td[4]")).getText());
		for(int i = 2; i <= 25; i++)
		{
			if(Double.parseDouble(driver.findElement(By.xpath("//table[@class='dataTable']"
					+ "//tbody//tr["+i+"]/td[4]")).getText()) > maxVal)
				maxVal = Double.parseDouble(driver.findElement(By.xpath("//table[@class='dataTable']"
						+ "//tbody//tr["+i+"]/td[4]")).getText());
		}
		
		System.out.println("Maximun Value is==================================>>>>>>>>>>>>>>>>>>>>>>>>"+maxVal);
			
		
	}

}
