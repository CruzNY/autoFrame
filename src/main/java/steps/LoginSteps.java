package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
	@Given("^User navigates to the stack overflow homepage$")
	public void user_navigates_to_the_stack_overflow_homepage(){
		System.out.println("first step");
	}

	@Given("^User verifies that the Home page is displayed$")
	public void user_verifies_that_the_Home_page_is_displayed(){
	    System.out.println("second step");
	}

	@Then("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button(){
	    System.out.println("thirrd step");
	}

	@Then("^Users verifies that the Login page is displayed$")
	public void users_verifies_that_the_Login_page_is_displayed(){
	    System.out.println("last step");
	}
}
