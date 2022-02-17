package co.com.google.testing.fdr.stepdefinitions.autentificacion.logueo;


import co.com.google.testing.fdr.utilities.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;


import static co.com.google.testing.fdr.questions.autentificacion.VerResultadosQuestion.verResultados;
import static co.com.google.testing.fdr.tasks.autentificacion.logueo.IngresarPalabraTask.ingresarValor;
import static co.com.google.testing.fdr.tasks.opensite.OpenSiteTask.openSiteGoogle;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AutentificacionStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Given("^que el usuario tiene toda la informacion que necesita$")
    public void queElUsuarioTieneTodaLaInformacionQueNecesita(List<Map<String, Object>> informacion)  {
        theActorCalled("Usuario").attemptsTo(CargarDatos.conLaSiguiente(informacion));
    }

    @Given("^Que el usuario esta en la pagina de google$")
    public void queElUsuarioEstaEnLaPaginaDeGoogle() {
        theActorInTheSpotlight().attemptsTo(openSiteGoogle());
    }

    @When("^Cuando ingrese la palabra a buscar$")
    public void cuandoIngreseLaPalabraABuscar()  {
        theActorInTheSpotlight().attemptsTo(ingresarValor());
    }

    @Then("^podra ver los resultados$")
    public void podraVerLosResultados()  {
        theActorInTheSpotlight().should(seeThat(verResultados()));
    }

}