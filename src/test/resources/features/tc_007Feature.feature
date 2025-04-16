Feature: Verificación de integridad y consistencia del documento tras la carga

  Scenario: Carga y verificación de integridad de un documento
    Given un usuario ha cargado la página de carga de documentos
    When el usuario selecciona y carga el documento "documento_prueba.pdf"
    Then la carga se inicia correctamente
    When el usuario abre el documento cargado
    Then el documento se visualiza sin errores
    When el usuario compara el documento cargado con el original
    Then no hay discrepancias en el contenido