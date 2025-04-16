import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page uploadPage;

    @Given("^El usuario está en la página de carga de documentos$")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        driver = ... // Initialize your WebDriver
        driver.get("http://example.com/upload");
        uploadPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @When("^El usuario selecciona un documento con formato permitido$")
    public void el_usuario_selecciona_un_documento_con_formato_permitido() {
        uploadPage.selectDocument("path/to/document.pdf");
    }

    @When("^Hace clic en 'Cargar documento'$")
    public void hace_clic_en_cargar_documento() {
        uploadPage.clickUploadButton();
    }

    @Then("^Se muestra el mensaje 'Documento cargado exitosamente'$")
    public void se_muestra_el_mensaje_documento_cargado_exitosamente() {
        uploadPage.verifySuccessMessage();
    }

    @Then("^El documento aparece en la lista$")
    public void el_documento_aparece_en_la_lista() {
        uploadPage.verifyDocumentInList("document.pdf");
    }
}