package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Configuration;
import utilities.Driver;

public class EtsyStepDefs {

    WebDriver driver = Driver.getDriver();

    @Given("^User is on esty homepage$")
    public void user_is_on_esty_homepage() throws Throwable {
        driver.get(Configuration.getProperty("etsyUrl"));
    }

    @Then("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String item) throws Throwable {

    }

    @And("^User verifies the result is only for searched item$")
    public void user_verifies_the_result_is_only_for_searched_item() throws Throwable {

    }
}
