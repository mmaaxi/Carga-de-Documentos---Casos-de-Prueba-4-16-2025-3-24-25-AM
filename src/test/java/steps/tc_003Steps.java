import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page = PageFactory.initElements(driver, tc_003Page.class);

    @Given("que selecciono un documento que excede el límite máximo")
    public void selecciono_documento_excede_limite() {
        page.seleccionarDocumentoExcedeTamano();
    }

    @When("intento cargar el documento")
    public void intento_cargar_documento() {
        page.intentarCargarDocumento();
    }

    @Then("el sistema notifica que el documento excede el tamaño permitido")
    public void sistema_notifica_documento_excede() {
        Assert.assertTrue(page.verificarNotificacionTamanoExcedido());
    }

    @Then("no se realiza la carga")
    public void no_realiza_carga() {
        Assert.assertFalse(page.verificarCargaRealizada());
    }

    @Then("se muestra mensaje 'Tamaño de archivo excedido'")
    public void se_muestra_mensaje_error() {
        Assert.assertTrue(page.verificarMensajeErrorTamanoExcedido());
    }
}