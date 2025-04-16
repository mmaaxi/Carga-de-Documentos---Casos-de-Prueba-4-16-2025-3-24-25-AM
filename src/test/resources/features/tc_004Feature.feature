Feature: Carga de documento con tamaño mínimo aceptable

  Scenario: Verificar carga de documento con tamaño mínimo
    Given el usuario ha seleccionado un documento que cumple con el tamaño mínimo aceptable
    When el usuario hace clic en 'Cargar documento'
    Then la carga inicia sin inconvenientes
    And se muestra mensaje 'Documento cargado exitosamente' y el documento aparece en la lista