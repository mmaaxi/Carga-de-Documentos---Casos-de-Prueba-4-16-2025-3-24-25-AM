import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "fileInput")
    WebElement fileInput;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "successMessage")
    WebElement successMessage;

    @FindBy(xpath = "//ul[@id='documentList']/li")
    WebElement documentList;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void selectDocument(String filePath) {
        fileInput.sendKeys(filePath);
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public void verifySuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        assertTrue(successMessage.isDisplayed());
    }

    public void verifyDocumentInList(String documentName) {
        wait.until(ExpectedConditions.visibilityOf(documentList));
        assertTrue(documentList.getText().contains(documentName));
    }
}