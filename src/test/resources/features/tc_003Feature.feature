Feature: Rechazo de documento que excede el tamaño máximo permitido

  Scenario: Intentar cargar un documento demasiado grande
    Given que selecciono un documento que excede el límite máximo
    When intento cargar el documento
    Then el sistema notifica que el documento excede el tamaño permitido
    And no se realiza la carga
    And se muestra mensaje 'Tamaño de archivo excedido'