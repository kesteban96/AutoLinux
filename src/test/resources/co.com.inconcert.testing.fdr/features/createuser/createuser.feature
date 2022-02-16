# language: en
@E2E_inconcert
  Feature: Create User
    @TestCase1
    Scenario Outline: Process to create a user
      Given that the user has all the information he needs
        | name   | password    |identificador  | nombre |apellido  |contraseña  |validarcontra  |
        |<name>  | <password>  |<identificador>|<nombre>|<apellido>|<contraseña>|<validarcontra>|
      And that the user is in the application
      When the user authenticates with their credentials
      And the user performs the flow to create the user
      Then the user will be able to visualize the created user
      Examples:
        |name|password|identificador|nombre|apellido|contraseña|validarcontra|
        ##@externaldata@./src/test/resources/co.com.inconcert.testing.fdr/datadriver/createuser/createuser.xlsx@Datos
	|administrator@demo|12345678|usuarioaut9|usuarioAutonombre|usuarioAutoApellido|12345678|12345678|
