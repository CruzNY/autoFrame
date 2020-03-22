package stepDefinitions.commonSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.BasePage;
import steps.commonSteps.SimpleSteps;

public class CommonSimple extends BasePage {
	SimpleSteps simpleSteps = new SimpleSteps();
	public CommonSimple() {
		super();
	}
	@And("^User enters \"([^\"]*)\" into \"([^\"]*)\" textbox$")
	public void user_enters_into_textbox(String text, String elementName) throws Throwable {
		sendKeysToWebElement(text,elementName);
	}
    @And("^User clicks on \"([^\"]*)\" button|link|icon|element$")
    public void user_clicks_on_something_button(String elementName) throws Throwable {
        clickWebElement(elementName);
    }
    @Then("^User verifies \"([^\"]*)\" is displayed as \"([^\"]*)\"$")
    public void user_verifies_something_is_displayed_as_something(String elementName, String message) throws Throwable {
        simpleSteps.verifyTextDisplayed(message, elementName);
    }
}
