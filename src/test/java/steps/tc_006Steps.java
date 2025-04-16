package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page uploadPage = new tc_006Page(driver);

    @Given("the user is uploading a file")
    public void theUserIsUploadingAFile() {
        // Initialize driver and navigate to file upload page
        uploadPage.navigateToUploadPage();
        uploadPage.startFileUpload();
    }

    @When("the network connection is lost")
    public void theNetworkConnectionIsLost() {
        // Simulate the loss of network connectivity
        uploadPage.simulateNetworkLoss();
    }

    @Then("the upload process is interrupted")
    public void theUploadProcessIsInterrupted() {
        // Verify the upload process is interrupted
        uploadPage.verifyUploadInterruption();
    }

    @And("the system detects the interruption")
    public void theSystemDetectsTheInterruption() {
        // Check the system detection of the interruption
        uploadPage.verifyInterruptionDetection();
    }

    @And("the process shows an error indicator")
    public void theProcessShowsAnErrorIndicator() {
        // Verify an error indicator is shown
        uploadPage.checkErrorIndicator();
    }

    @And("a retry option is displayed")
    public void aRetryOptionIsDisplayed() {
        // Verify the display of the retry button
        uploadPage.verifyRetryButtonDisplayed();
    }
}