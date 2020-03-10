package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/"},
		glue = {"steps"},
		tags = "@run",
		monochrome = true
		)

public class NewCustomerRunner {

}
