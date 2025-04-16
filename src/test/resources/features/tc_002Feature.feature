Feature: Documento con extensión no permitida

  Scenario: Rechazo de documento con extensión no permitida
    When selecciono un documento con extensión no permitida
    Then el sistema rechaza la selección y muestra una alerta
    When intento cargar el documento
    Then no se inicia el proceso de carga
    When verifico el mensaje de error
    Then se muestra mensaje 'Extensión de archivo no permitida'