package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/piHappiness/App/features",
    glue = {"stepDefinitions", "base", "pages", "utils"},
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)

public class TestRunner {

}
