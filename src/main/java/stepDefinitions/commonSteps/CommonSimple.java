package stepDefinitions.commonSteps;

import cucumber.api.java.en.And;
import pageObjects.BasePage;

public class CommonSimple extends BasePage {
	public CommonSimple() {
		super();
	}
	@And("^User enters \"([^\"]*)\" into \"([^\"]*)\" textbox$")
	public void user_enters_into_textbox(String text, String elementName) throws Throwable {
		sendKeysToWebElement(text,elementName);
	}
    @And("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_something_button(String elementName) throws Throwable {
        clickWebElement(elementName);
    }
}
