package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber" }, strict = true, features = "src/test/resources/", glue = "src/test/java/stepDefinition/")

public class CucumberRunner {

}
