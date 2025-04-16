package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFile(String filePath) {
        WebElement uploadInput = driver.findElement(By.id("fileUploadInput"));
        uploadInput.sendKeys(filePath);
    }

    public boolean isAlertDisplayed() {
        WebElement alert = driver.findElement(By.id("alert"));
        return alert.isDisplayed();
    }

    public void tryUploadFile() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean isUploadStarted() {
        // You can implement actual logic for checking if the upload started
        return false;
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        return errorMessage.getText();
    }

    public boolean isErrorMessageDisplayed(String expectedMessage) {
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        return errorMessage.isDisplayed() && errorMessage.getText().equals(expectedMessage);
    }
}