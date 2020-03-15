package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory{
	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page(){
		login.getLoginPage();
	}

	@Then("^User verifies the login page is displayed$")
	public void user_verifies_the_login_page_is_displayed(){
	   throw new PendingException();
	}

	@Then("^User enters login id$")
	public void user_enters_login_id(){
	    login.enterEmail("mngr249521");
	}

	@Then("^User enters password$")
	public void user_enters_password(){
	    login.enterPassword("asUrade");
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button(){
	    login.clickLoginButton();
	}
	@And("^User verifies login page is displayed$")
	public void user_verifies_login_page_is_displayed(){
		login.homempageVerification.isDisplayed();
		logger.info("Login Successful!");
	}
    @And("^User click on \"([^\"]*)\" link$")
    public void user_click_on_something_link(String strArg1) throws Throwable {
    	login.clickLink();
    }
}
