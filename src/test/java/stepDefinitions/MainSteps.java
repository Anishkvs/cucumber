package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on the Netbanking  landing page")
	public void user_is_on_the_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is on the Landing page");
	}
	@When("User login into the application with {string} and {string}")
	public void user_login_into_the_application_with_and(String userName, String pass) {
	   System.out.println("user and pass");
	}
	
	//Regular Expression:
	@When("Regular User login into the application with userName and password")
	public void regular_user_login_into_the_application_with_user_name_and_password() {
	  
		System.out.println("Regular Expression");
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("HomePage is displayed");
		}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Card is displayed");
	}
}
