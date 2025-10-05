package stepDefinitions;


import java.util.List;

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
	
	@Given("User is on pratice landing page")
	public void user_is_on_pratice_landing_page() {
	   System.out.println("landing page");
	}
	@When("User 	SignUp into application")
	public void user_sign_up_into_application(List<String> data) {
	
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}

@Then("HomePage is displayed1")
public void home_page_is_displayed1() {
    // Write code here that turns the phrase above into concrete actions
}

		@Given("setup the entries in database")
		public void setupEntries() {
			System.out.println("******SetUp********");
		}
		@When("launch the browser from config variables")
		public void launchBrowser() {
			System.out.println("******launchBrowser********");
		}
		@Then("Hit the homepage URl of banking site")
		public void HitUrls() {
			System.out.println("******HitUrls********");
		}
}
