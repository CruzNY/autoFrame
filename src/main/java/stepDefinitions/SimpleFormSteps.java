package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class SimpleFormSteps extends DriverFactory{
	
    @Given("^User navigates to simple form webpage$")
    public void user_navigates_to_simple_form_webpage() throws Throwable {
    	getDriver().get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @Then("^User verifies message is displayed as \"([^\"]*)\"$")
    public void user_verifies_message_is_displayed_as_something(String message) throws Throwable {
        simpleForm.verifyMessage(message);
    }

    @And("^User enters \"([^\"]*)\" into message textbox$")
    public void user_enters_something_into_message_textbox(String message) throws Throwable {
    	simpleForm.enterMessage(message);
    }
    @And("^User clicks on show message button$")
    public void user_clicks_on_show_message_button() throws Throwable {
        simpleForm.clickButton();
    }
}	
