package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;
import utils.DriverFactory;

public class tc_005Steps {
    WebDriver driver = DriverFactory.getDriver();
    tc_005Page page = new tc_005Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario intenta cargar el documento sin título ni descripción")
    public void el_usuario_intenta_cargar_el_documento_sin_título_ni_descripción() {
        page.submitWithoutFillingRequiredFields();
    }

    @Then("el sistema debe identificar los campos vacíos")
    public void el_sistema_debe_identificar_los_campos_vacíos() {
        Assert.assertTrue("El sistema no identificó los campos vacíos", page.isFieldValidationDisplayed());
    }

    @When("el usuario hace clic en 'Cargar documento'")
    public void el_usuario_hace_clic_en_Cargar_documento() {
        page.clickUploadButton();
    }

    @Then("la carga debe ser rechazada")
    public void la_carga_debe_ser_rechazada() {
        Assert.assertFalse("La carga no fue rechazada como se esperaba", page.isUploadSuccessful());
    }

    @And("se muestra el mensaje de error 'Por favor, complete todos los campos obligatorios'")
    public void se_muestra_el_mensaje_de_error() {
        Assert.assertEquals("Por favor, complete todos los campos obligatorios", page.getErrorMessage());
    }
}