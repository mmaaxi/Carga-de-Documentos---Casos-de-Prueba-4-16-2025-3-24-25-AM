package steps;

import pages.tc_008Page;
import io.cucumber.java.en.*;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("^El usuario está autenticado como \"([^\"]*)\"$")
    public void el_usuario_está_autenticado_como(String usuario) {
        page.autenticarUsuario(usuario);
    }

    @When("^El usuario intenta cargar un documento$")
    public void el_usuario_intenta_cargar_un_documento() {
        page.intentarCargarDocumento();
    }

    @Then("^El sistema verifica los permisos de usuario$")
    public void el_sistema_verifica_los_permisos_de_usuario() {
        page.verificarPermisosDeUsuario();
    }

    @When("^El usuario intenta acceder a una funcionalidad restringida$")
    public void el_usuario_intenta_acceder_a_una_funcionalidad_restringida() {
        page.intentarAccederFuncionalidadRestringida();
    }

    @Then("^El acceso es denegado$")
    public void el_acceso_es_denegado() {
        page.verificarAccesoDenegado();
    }

    @When("^El usuario recibe un error de autenticación$")
    public void el_usuario_recibe_un_error_de_autenticación() {
        page.recibirErrorAutenticacion();
    }

    @Then("^Se muestra mensaje 'Acceso no autorizado'$")
    public void se_muestra_mensaje_acceso_no_autorizado() {
        page.verificarMensajeAccesoNoAutorizado();
    }
}