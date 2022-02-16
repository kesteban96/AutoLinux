# language: en
@E2E_inconcert
  Feature: interaction chats

    @TestCase1
    Scenario Outline: interaction between the client and the snippet
      Given that the user has all the information he needs
        | name      | password    |message| url |cuenta|
        |<name>  | <password>      | <message> |<url>|<cuenta> |
      And customer chat send message
      And that the user is in the application
      When the user authenticates with their credentials
      And  user changes status to online
      Then the user can validate the message

      Examples:
      |name|password|message|url|cuenta|
         ##@externaldata@./src/test/resources/co.com.inconcert.testing.fdr/datadriver/chat/chat.xlsx@Datos
	|autochat@demo|pruebaauto1234|Hola|https://test1.i6.inconcertcc.com/prueba/indexkev.html|ChatCuentas|
	|usuarioauto1@demo|12345678|Hola|https://test1.i6.inconcertcc.com/prueba/indexkev.html|ChatCuentas|
