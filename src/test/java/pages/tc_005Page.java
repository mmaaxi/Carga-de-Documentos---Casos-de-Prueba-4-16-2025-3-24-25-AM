package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    private By uploadPageSelector = By.id("uploadPage");
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMsg");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        // Navigate to upload page, example method
        driver.get("http://example.com/upload");
    }

    public void submitWithoutFillingRequiredFields() {
        // Attempt to submit the form without entering required information
        // Assuming fields are left empty
    }

    public boolean isFieldValidationDisplayed() {
        // Mock-up validation, use real locators/selection criteria
        return driver.findElement(uploadPageSelector).isDisplayed();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessful() {
        // Mock result of upload attempt, replace with appropriate validation
        return false;
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}