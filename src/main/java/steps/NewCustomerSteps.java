package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class NewCustomerSteps extends DriverFactory{
	@Then("^User enters name$")
	public void user_enters_name() throws Throwable {	
		newCustomer.enterName(newCustomer.formInfo.get("Name"));
	}
	@Then("^User selects gender$")
	public void user_selects_gender() throws Throwable {
		newCustomer.selectGender();
	}
	@Then("^User enteres date of birth$")
	public void user_enteres_date_of_birth() throws Throwable {
		newCustomer.enterDOB(newCustomer.formInfo.get("DOB"));
	}
	@Then("^User enters address$")
	public void user_enters_address() throws Throwable {
		newCustomer.enterAddress(newCustomer.formInfo.get("Address"));
	}
	@Then("^User enteres city$")
	public void user_enteres_city() throws Throwable {
		newCustomer.enterCityFeld(newCustomer.formInfo.get("City"));
	}
	@Then("^User enteres state$")
	public void user_enteres_state() throws Throwable {
		newCustomer.enterStateFeld(newCustomer.formInfo.get("State"));
	}
	@Then("^User enteres pin$")
	public void user_enteres_pin() throws Throwable {
		newCustomer.enterPin(newCustomer.formInfo.get("PIN"));
	}
	@Then("^User enteres mobile number$")
	public void user_enteres_mobile_number() throws Throwable {
		newCustomer.enterMobileNumber(newCustomer.formInfo.get("Mobile Number"));
	}
	@Then("^User enteres email$")
	public void user_enteres_email() throws Throwable {
		newCustomer.enterEmail(newCustomer.formInfo.get("Email"));
	}
	@Then("^User enteres password$")
	public void user_enteres_password() throws Throwable {
		newCustomer.enterPassword(newCustomer.formInfo.get("PW"));
	}
    @And("^User click on \"([^\"]*)\" button$")
    public void user_click_on_something_button(String strArg1) throws Throwable {
        newCustomer.clickButton(strArg1);
    }
}
