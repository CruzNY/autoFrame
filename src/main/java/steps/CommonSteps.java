package steps;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class CommonSteps extends DriverFactory {
    @And("^User clicks on \"([^\"]*)\" button|link|icon$")
    public void user_clicks_on_something_buttonlinkicon(WebElement element) throws Throwable {
    	element.click();
    }
	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page(){
		getDriver().get("http://www.demo.guru99.com/V4/");
		logger.info("Naivgating to: " + driver.getCurrentUrl());
	}
}
