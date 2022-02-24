# language: en
@E2E_Google
 Feature: Google

  @TestCase1
  Scenario Outline:  Entrar a la pagina de google y buscar una palabra
    Given que el usuario tiene toda la informacion que necesita
      |palabra     |
      |<palabra>   |
    And Que el usuario esta en la pagina de google
    When Cuando ingrese la palabra a buscar
    Then podra ver los resultados
    Examples:
      |palabra|
	|Atletico nacional|



