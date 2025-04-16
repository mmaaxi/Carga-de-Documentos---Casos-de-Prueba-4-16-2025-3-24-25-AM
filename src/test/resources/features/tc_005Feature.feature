Feature: Validación de campos obligatorios durante la carga de documentos

  Scenario: El usuario intenta cargar un documento sin completar campos obligatorios
    Given el usuario está en la página de carga de documentos
    When el usuario intenta cargar el documento sin título ni descripción
    Then el sistema debe identificar los campos vacíos
    When el usuario hace clic en 'Cargar documento'
    Then la carga debe ser rechazada
    And se muestra el mensaje de error 'Por favor, complete todos los campos obligatorios'