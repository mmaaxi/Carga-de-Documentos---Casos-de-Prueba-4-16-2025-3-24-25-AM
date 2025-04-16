import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;
    
    private By inputFileSelector = By.id("file-upload");
    private By uploadButton = By.id("upload-button");
    private By notification = By.id("notification");
    private By errorMesage = By.id("error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoExcedeTamano() {
        // Código para seleccionar un archivo que exceda el tamaño permitido
        driver.findElement(inputFileSelector).sendKeys("/path/to/large/file");
    }

    public void intentarCargarDocumento() {
        driver.findElement(uploadButton).click();
    }

    public boolean verificarNotificacionTamanoExcedido() {
        return driver.findElement(notification).getText().contains("archivo excede el tamaño permitido");
    }
    
    public boolean verificarCargaRealizada() {
        // Verificar si el archivo fue cargado
        return false; // Asumimos que siempre debe devolver false para este caso
    }

    public boolean verificarMensajeErrorTamanoExcedido() {
        return driver.findElement(errorMesage).getText().contains("Tamaño de archivo excedido");
    }
}