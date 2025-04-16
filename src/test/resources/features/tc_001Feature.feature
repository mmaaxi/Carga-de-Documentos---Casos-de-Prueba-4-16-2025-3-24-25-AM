Feature: Carga exitosa de documento con formato válido

  Scenario: Subir un documento con formato permitido
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona un documento con formato permitido
    And Hace clic en 'Cargar documento'
    Then Se muestra el mensaje 'Documento cargado exitosamente'
    And El documento aparece en la lista