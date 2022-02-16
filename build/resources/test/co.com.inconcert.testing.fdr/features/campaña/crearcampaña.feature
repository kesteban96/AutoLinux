# language: en
@E2E_inconcert
  Feature: campaign creation
    @TestCase1
    Scenario Outline: The complete creation of a campaign is carried out
      Given that the user has all the information he needs
        | name   | password    |campaignname  | descripcion |accountname  |umbrales  |
        |<name>  | <password>  |<campaignname>|<descripcion>|<accountname>|<umbrales>|
      And that the user is in the application
      When the user authenticates with their credentials
      And the user performs the flow to create the campaign
      Then the user will be able to visualize the created campaign

      Examples:
        |name|password|campaignname|descripcion|accountname|umbrales|
        ##@externaldata@./src/test/resources/co.com.inconcert.testing.fdr/datadriver/campaña/creation.xlsx@Datos
	|administrator@demo|12345678|CampAuto1|Campaña prueba1|prueba|15|
	|administrator@demo|12345678|CampAuto2|Campaña prueba2|prueba1|16|
	|administrator@demo|12345678|CampAuto3|Campaña prueba3|prueba2|17|
