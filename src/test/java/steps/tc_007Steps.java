package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page documentPage = new tc_007Page();

    @Given("un usuario ha cargado la página de carga de documentos")
    public void usuario_ha_cargado_la_pagina_de_carga() {
        documentPage.navigateToDocumentUploadPage();
    }

    @When("el usuario selecciona y carga el documento {string}")
    public void usuario_selecciona_y_carga_documento(String docName) {
        boolean isUploadStarted = documentPage.uploadDocument(docName);
        Assert.assertTrue("La carga no se inició correctamente", isUploadStarted);
    }

    @Then("la carga se inicia correctamente")
    public void la_carga_se_inicia_correctamente() {
        Assert.assertTrue("La carga no inició correctamente", documentPage.isUploadSuccessful());
    }

    @When("el usuario abre el documento cargado")
    public void usuario_abre_el_documento_cargado() {
        documentPage.openUploadedDocument();
    }

    @Then("el documento se visualiza sin errores")
    public void el_documento_se_visualiza_sin_errores() {
        Assert.assertTrue("El documento no se visualiza correctamente", documentPage.isDocumentDisplayedCorrectly());
    }

    @When("el usuario compara el documento cargado con el original")
    public void usuario_compara_documento_con_original() {
        boolean isDocumentConsistent = documentPage.compareWithOriginalDocument();
        Assert.assertTrue("Existen discrepancias en el contenido", isDocumentConsistent);
    }

    @Then("no hay discrepancias en el contenido")
    public void no_hay_discrepancias_en_el_contenido() {
        Assert.assertTrue("Se encontraron discrepancias en el contenido", documentPage.isDocumentContentConsistent());
    }
}