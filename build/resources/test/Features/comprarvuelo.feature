Feature: Automatizar pagina de viajes

  Scenario Outline: Comprar de tiquetes
    Given Ingreso a la <url>
    When realizo la busqueda de un vuelo desde <ciudad_origen> el <fecha_salida>, hasta <ciudad_destino> el <fecha_regreso>
    Then para obtener el mensaje <Mensaje> en la pagina
    Examples:
      | url |ciudad_origen|ciudad_destino|fecha_salida|fecha_regreso|Mensaje|
      | "https://www.avianca.com/co/es/" | "medellin" |"bogota" |"2023.3.30"|"2023.4.11"|"texto_validacion"|