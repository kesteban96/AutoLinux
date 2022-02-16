# language: en
@E2E_inconcert
 Feature: login

  @TestCase1
  Scenario Outline: : Enter the aplication
    Given that the user has all the information he needs
      | name | password |
      | <name> | <password> |
    And that the user is in the application
    When the user authenticates with their credentials
    Then the user should be able to view the application
    Examples:
      |name|password         |
       ##@externaldata@./src/test/resources/co.com.inconcert.testing.fdr/datadriver/autentificacion/Autentificacion.xlsx@Datos
	|autochat@demo|pruebaauto1234|
	|autochat@demo|pruebaauto1234|
	|autochat@demo|pruebaauto1234|


