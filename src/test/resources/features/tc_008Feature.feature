Feature: Pruebas de seguridad y control de acceso en la carga de documentos

  Scenario: El usuario sin permisos intenta cargar un documento
    Given El usuario está autenticado como "usuarioSinPermisos"
    When El usuario intenta cargar un documento
    Then El sistema verifica los permisos de usuario

  Scenario: El usuario intenta acceder a funcionalidades restringidas
    Given El usuario está autenticado como "usuarioSinPermisos"
    When El usuario intenta acceder a una funcionalidad restringida
    Then El acceso es denegado

  Scenario: Verificar el mensaje de error de autenticación
    Given El usuario está autenticado como "usuarioSinPermisos"
    When El usuario recibe un error de autenticación
    Then Se muestra mensaje 'Acceso no autorizado'