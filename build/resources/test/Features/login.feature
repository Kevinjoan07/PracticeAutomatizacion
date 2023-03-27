Feature: Login en pagina saucedemo.com

  Scenario: login exitoso
    Given ingreso a la pagina de "https://www.saucedemo.com/"
    When ingreso "standard_user" y "secret_sauce"
    Then valido en pantalla el mensaje "Swag Labs"
