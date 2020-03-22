package steps.common;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.BasePage;

public class CommonSteps extends BasePage {
	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page(){
		getDriver().get("http://www.demo.guru99.com/V4/");
		logger.info("Naivgating to: " + driver.getCurrentUrl());
	}
}
