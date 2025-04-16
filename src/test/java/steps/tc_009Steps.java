package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("the user simulates a temporary connection failure on load initiation")
    public void user_simulates_connection_failure() {
        page.simulateConnectionFailure();
    }

    @When("the system detects the connection failure")
    public void system_detects_connection_failure() {
        Assert.assertTrue(page.isFailureDetected());
    }

    @Then("the system should automatically retry without user intervention")
    public void system_retries_automatically() {
        Assert.assertTrue(page.isRetryInitiated());
    }
    
    @Then("verify the loading result")
    public void verify_loading_result() {
        if (page.isConnectionRestored()) {
            Assert.assertTrue(page.isLoadingComplete());
        } else {
            Assert.assertTrue(page.isErrorMessageDisplayed());
        }
    }
}