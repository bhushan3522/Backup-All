package StepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsSD {

	@Before
	public void setup()
	{
		System.out.println("setUp Method");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("tearDown method");
	}
	
	@Before("@First")
	public void localB()
	{
		System.out.println("Local Before");
	}
	@After("@First")
	public void localA()
	{
		System.out.println("Local After");
	}
	
	@Given("^Enter$")
	public void enter(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter SD");
	}

	@When("^Print$")
	public void print(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Print SD");
	}

	@Then("^Exit$")
	public void exit(){
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Exit SD");
	}
	
	@Given("^perform login$")
	public void perform_login() {
		System.out.println("Login Operation");
	}

	@When("^on login page$")
	public void on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("On Logi page");
	}

	@Then("^do something$")
	public void do_something() {
	    // Write code here that turns the phrase above into concrete actions
			System.out.println("do spmething");
	}

	@Then("^logout$")
	public void logout() {
	    // Write code here that turns the phrase above into concrete actions
			System.out.println("perform logout");
	}
	
}
