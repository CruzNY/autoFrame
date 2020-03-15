package steps;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import utils.DriverFactory;

public class CommonSteps extends DriverFactory {
    @And("^User clicks on \"([^\"]*)\" button|link|icon$")
    public void user_clicks_on_something_buttonlinkicon(WebElement element) throws Throwable {
    	element.click();
    }
}
