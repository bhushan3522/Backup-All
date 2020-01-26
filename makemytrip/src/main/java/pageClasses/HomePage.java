package pageClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbaseClass.TestBaseClass;

public class HomePage extends TestBaseClass {

	@FindBy(xpath="//img[contains(@src,\"mmtLogoWhite.png\")]")
	private WebElement mmtLogo;
	
	@FindBy(css="ul.userSection.pushRight > li")
	private List<WebElement> headerElements;
	
	@FindBy(css="nav>ul.makeFlex.font12>li")
	private List<WebElement> menuOptions;

	public HomePage(){
		initialization();
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMMTLogo() {
		return mmtLogo.isDisplayed();
	}
	
	public boolean validateVisibiltyOfHeaderElements() {
		if(headerElements.size()==6) {
			return true;
		}
		else
			return false;
	}

}