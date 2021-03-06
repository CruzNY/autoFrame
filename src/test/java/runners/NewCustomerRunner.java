package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/"},
		glue = {"steps"},
		tags = "@run",
		plugin = {"pretty", "html:target/cucumber-reports/newCustomer"},
		monochrome = true
		)

public class NewCustomerRunner {

}
