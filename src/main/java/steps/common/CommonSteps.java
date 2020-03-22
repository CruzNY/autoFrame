package steps.common;

import cucumber.api.java.en.And;
import utils.DriverFactory;

public class CommonSteps extends DriverFactory {
	@And("^User enters \"([^\"]*)\" into \"([^\"]*)\" textbox$")
	public void user_enters_into_textbox(String text, String elementName) throws Throwable {
		simpleForm.sendKeysToWebElement(text,elementName);
	}
    @And("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_something_button(String elementName) throws Throwable {
        simpleForm.clickWebElement(elementName);
    }
}
