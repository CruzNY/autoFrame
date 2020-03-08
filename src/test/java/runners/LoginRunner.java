package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/"},
		glue = {"steps"},
		monochrome = true
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
