package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    WebDriver driver;

    By documentInput = By.id("documentInput");
    By uploadButton = By.id("uploadButton");
    By successMessage = By.id("successMessage");
    By documentList = By.id("documentList");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDocumentWithMinimumSize() {
        WebElement inputElement = driver.findElement(documentInput);
        inputElement.sendKeys("/path/to/minimum/size/document");
    }

    public void clickUploadButton() {
        WebElement buttonElement = driver.findElement(uploadButton);
        buttonElement.click();
    }

    public void verifyUploadStartsSuccessfully() {
        // Logic to verify upload has started, e.g., spinner or progress bar visible
    }

    public void verifySuccessMessageAndDocumentInList() {
        WebElement messageElement = driver.findElement(successMessage);
        boolean isMessageDisplayed = messageElement.getText().contains("Documento cargado exitosamente");
        assert isMessageDisplayed;

        WebElement listElement = driver.findElement(documentList);
        boolean isDocumentInList = listElement.getText().contains("min-size-document");
        assert isDocumentInList;
    }
}