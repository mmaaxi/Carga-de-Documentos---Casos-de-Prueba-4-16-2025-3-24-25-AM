package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_010Page;
import org.junit.Assert;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("El usuario ha iniciado sesión y navegado a la sección de documentos")
    public void elUsuarioHaIniciadoSesionYNavegadoALaSeccionDeDocumentos() {
        page.loginAndNavigateToDocumentsSection();
    }

    @When("El usuario selecciona el documento para actualización")
    public void elUsuarioSeleccionaElDocumentoParaActualizacion() {
        page.selectDocumentForUpdate();
    }

    @Then("El sistema identifica la versión actual del documento")
    public void elSistemaIdentificaLaVersionActualDelDocumento() {
        Assert.assertTrue(page.verifyCurrentDocumentVersionIsIdentified());
    }

    @When("El usuario sube el documento modificado como nueva versión")
    public void elUsuarioSubeElDocumentoModificadoComoNuevaVersion() {
        page.uploadModifiedDocumentAsNewVersion();
    }

    @Then("El sistema valida la actualización y diferencias de versión")
    public void elSistemaValidaLaActualizacionYDiferenciasDeVersion() {
        Assert.assertTrue(page.verifyVersionUpdateAndDifferencesValidated());
    }

    @When("El usuario verifica la lista de documentos")
    public void elUsuarioVerificaLaListaDeDocumentos() {
        page.checkDocumentList();
    }

    @Then("El documento aparece con la versión actualizada")
    public void elDocumentoApareceConLaVersionActualizada() {
        Assert.assertTrue(page.verifyDocumentVersionUpdatedInList());
    }
}