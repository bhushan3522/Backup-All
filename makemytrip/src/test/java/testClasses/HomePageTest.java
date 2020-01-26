package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClasses.HomePage;
import testbaseClass.TestBaseClass;

public class HomePageTest extends TestBaseClass {
	
	HomePage homePage;
	@BeforeMethod
	public void setup() {
		homePage = new HomePage();
	}
	
	@AfterMethod
	public void tearDown() {
		destruct();
	}
	
	@Test
	public void testMMTLogoPresense() {
		boolean result = homePage.validateMMTLogo();
		Assert.assertEquals(result, true);;
	}

}
