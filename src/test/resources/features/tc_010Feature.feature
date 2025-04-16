Feature: Gestión de versiones y actualización de documentos

  Scenario: Actualización de un documento y verificación de la nueva versión
    Given El usuario ha iniciado sesión y navegado a la sección de documentos
    When El usuario selecciona el documento para actualización
    Then El sistema identifica la versión actual del documento
    When El usuario sube el documento modificado como nueva versión
    Then El sistema valida la actualización y diferencias de versión
    When El usuario verifica la lista de documentos
    Then El documento aparece con la versión actualizada