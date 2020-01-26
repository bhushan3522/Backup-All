package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbaseClass.TestBaseClass;

public class TrainsPage extends TestBaseClass {
	
	@FindBy(css="#fromCity")
	private WebElement fromCity;
	
	@FindBy(css="#toCity")
	private WebElement toCity;

}
