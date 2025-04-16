Feature: Manejo de errores en caso de interrupciones de red durante la carga
  Scenario: Verificar manejo de interrupciones de red durante la carga
    Given the user is uploading a file
    When the network connection is lost
    Then the upload process is interrupted
    And the system detects the interruption
    And the process shows an error indicator
    And a retry option is displayed