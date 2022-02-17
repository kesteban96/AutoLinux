package co.com.inconcert.testing.fdr.stepdefinitions.autentificacion.logueo;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import co.com.inconcert.testing.fdr.utilities.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


import static co.com.inconcert.testing.fdr.questions.autentificacion.ValidarLoginQuestion.validarLogin;
import static co.com.inconcert.testing.fdr.tasks.opensite.OpenSiteTask.openSiteInConcert;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static co.com.inconcert.testing.fdr.tasks.autentificacion.logueo.IngresarUsuarioTask.ingresarUsuario;


public class AutentificacionStepDefinitions {



    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

//    @Given("^that the user has all the information he needs$")
//    public void thatTheUserHasAllTheInformationHeNeeds(List<Map<String, Object>> informacion){
//        theActorCalled("Usuario").attemptsTo(CargarDatos.conLaSiguiente(informacion));
//    }
//
//    @Given("^that the user is in the application$")
//    public void thatTheUserIsInTheApplication(){
//       theActorInTheSpotlight().attemptsTo(openSiteInConcert());
//
//    }
//
//    @When("^the user authenticates with their credentials$")
//    public void theUserAuthenticatesWithTheirCredentials(){
//
//        theActorInTheSpotlight().attemptsTo(
//                ingresarUsuario()
//        );
//    }
//
//    @Then("^the user should be able to view the application$")
//    public void theUserShouldBeAbleToViewTheApplication() {
//
//        theActorInTheSpotlight().should(
//                seeThat(validarLogin()
//                ));
//    }

    @Given("^que el usuario tiene toda la informacion que necesita$")
    public void queElUsuarioTieneTodaLaInformacionQueNecesita(List<Map<String, Object>> informacion)  {
        theActorCalled("Usuario").attemptsTo(CargarDatos.conLaSiguiente(informacion));
    }

    @Given("^Que el usuario esta en la pagina de google$")
    public void queElUsuarioEstaEnLaPaginaDeGoogle() {
        theActorInTheSpotlight().attemptsTo(openSiteInConcert());
    }

    @When("^Cuando ingrese la palabra a buscar$")
    public void cuandoIngreseLaPalabraABuscar()  {
    }

    @Then("^podra ver los resultados$")
    public void podraVerLosResultados()  {
        ;
    }

}