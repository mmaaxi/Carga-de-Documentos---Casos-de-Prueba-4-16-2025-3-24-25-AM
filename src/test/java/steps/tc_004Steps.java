package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page = PageFactory.initElements(driver, tc_004Page.class);

    @Given("el usuario ha seleccionado un documento que cumple con el tamaño mínimo aceptable")
    public void el_usuario_selecciona_documento() {
        page.selectDocumentWithMinimumSize();
    }

    @When("el usuario hace clic en 'Cargar documento'")
    public void el_usuario_click_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("la carga inicia sin inconvenientes")
    public void la_carga_inicia_sin_inconvenientes() {
        page.verifyUploadStartsSuccessfully();
    }

    @And("se muestra mensaje 'Documento cargado exitosamente' y el documento aparece en la lista")
    public void verificar_mensaje_exitoso_y_documento_en_lista() {
        page.verifySuccessMessageAndDocumentInList();
    }
}