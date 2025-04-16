package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void autenticarUsuario(String usuario) {
        // Lógica para autenticar usuario en el sistema
    }

    public void intentarCargarDocumento() {
        // Lógica para intentar cargar un documento
    }

    public void verificarPermisosDeUsuario() {
        // Lógica para verificar permisos del usuario
        // Validación: el usuario no debería tener permisos suficientes
    }

    public void intentarAccederFuncionalidadRestringida() {
        // Lógica para intentar acceder a funcionalidades restringidas
    }

    public void verificarAccesoDenegado() {
        // Validación: el acceso debería ser denegado
    }

    public void recibirErrorAutenticacion() {
        // Lógica para simular error de autenticación
    }

    public void verificarMensajeAccesoNoAutorizado() {
        // Validación: se debería mostrar el mensaje 'Acceso no autorizado'
    }
}