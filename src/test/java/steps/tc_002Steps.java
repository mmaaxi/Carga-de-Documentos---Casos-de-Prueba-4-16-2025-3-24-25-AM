package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @When("selecciono un documento con extensión no permitida")
    public void selecciono_documento_con_extension_no_permitida() {
        page.selectFile("C:\\path_to_invalid_file.exe");
    }

    @Then("el sistema rechaza la selección y muestra una alerta")
    public void sistema_rechaza_seleccion_muestra_alerta() {
        Assert.assertTrue(page.isAlertDisplayed());
    }

    @When("intento cargar el documento")
    public void intento_cargar_documento() {
        page.tryUploadFile();
    }

    @Then("no se inicia el proceso de carga")
    public void no_se_inicia_proceso_carga() {
        Assert.assertFalse(page.isUploadStarted());
    }

    @When("verifico el mensaje de error")
    public void verifico_mensaje_error() {
        Assert.assertEquals("Extensión de archivo no permitida", page.getErrorMessage());
    }

    @Then("se muestra mensaje 'Extensión de archivo no permitida'")
    public void muestra_mensaje_extension_no_permitida() {
        Assert.assertTrue(page.isErrorMessageDisplayed("Extensión de archivo no permitida"));
    }
}