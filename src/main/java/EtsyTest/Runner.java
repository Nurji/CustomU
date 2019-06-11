package EtsyTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/EtsyTestFeatures/EtsyTest.feature",
        glue = "StepDefinitions",
        dryRun = false
    // true - checking; false - run methods
)
public class Runner {

}
