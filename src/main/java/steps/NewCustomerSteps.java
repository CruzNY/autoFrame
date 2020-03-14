package steps;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class NewCustomerSteps extends DriverFactory{
	@Then("^User enters name$")
	public void user_enters_name() throws Throwable {	
//		newCustomer.enterName("Alex");
		newCustomer.enterName(newCustomer.formInfo.get("Name"));
	}
	@Then("^User selects gender$")
	public void user_selects_gender() throws Throwable {
		newCustomer.selectGender();
	}

	@Then("^User enteres date of birth$")
	public void user_enteres_date_of_birth() throws Throwable {
//		newCustomer.enterDOB("05/18/1994");
		newCustomer.enterDOB(newCustomer.formInfo.get("DOB"));
	}

	@Then("^User enters address$")
	public void user_enters_address() throws Throwable {
		newCustomer.enterAddress("100 Main Driver");
	}

	@Then("^User enteres city$")
	public void user_enteres_city() throws Throwable {
		newCustomer.enterCityFeld("Brooklyn");
	}

	@Then("^User enteres state$")
	public void user_enteres_state() throws Throwable {
		newCustomer.enterStateFeld("NY");
	}

	@Then("^User enteres pin$")
	public void user_enteres_pin() throws Throwable {
		newCustomer.enterPin("32432423");
	}

	@Then("^User enteres mobile number$")
	public void user_enteres_mobile_number() throws Throwable {
		newCustomer.enterMobileNumber("212-545-9945");
	}

	@Then("^User enteres email$")
	public void user_enteres_email() throws Throwable {
		newCustomer.enterEmail("tester@mailinator.com");		
	}

	
	@Then("^User enteres password$")
	public void user_enteres_password() throws Throwable {
		newCustomer.enterPassword("password");
	}
}
