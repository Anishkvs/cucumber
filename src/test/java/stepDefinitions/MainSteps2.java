//package stepDefinitions;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class MainSteps {
//	@Given("User is on STC landing page")
//	public void user_is_on_stc_landing_page() {
//	
//	  //    System.setProperty("webdriver.edge.driver", "D:\\ADriver\\msedgedriver.exe");
//		WebDriverManager.edgedriver().proxy("http://proxyhost:port").setup();
//
//	//	WebDriverManager.edgedriver().setup();
//	  	 WebDriver driver = new EdgeDriver();
//	  	 driver.get("https://www.google.com/");
//	  	 
//			
//	}
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String Username, String Password) {
//	   System.out.println(Username+" "+Password);
//	}
//	@Then("User is on selfcare dashboard page")
//	public void user_is_on_selfcare_dashboard_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new io.cucumber.java.PendingException();
//	}
//	@Then("User name is displayed")
//	public void user_name_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	  //  throw new io.cucumber.java.PendingException();
//	}
//	@When("User SignUp into application")
//	public void user_sign_up_into_application(List<String> data) {
//	   System.out.println(data.get(0));
//	   System.out.println(data.get(1));
//	   System.out.println(data.get(2));
//	   System.out.println(data.get(3));
//	
//	}
//	
//	@When("launch the broswer")
//	public void launch_the_broswer() {
//	    
//	}
//	@Then("hit the home URL")
//	public void hit_the_home_url() {
//	
//	}
//}
