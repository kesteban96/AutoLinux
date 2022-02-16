package co.com.inconcert.testing.fdr.stepdefinitions.createuser;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.inconcert.testing.fdr.questions.createuser.UserValidate.userValidate;
import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.*;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CreateUserStepDefinitions {

    @When("^the user performs the flow to create the user$")
    public void theUserPerformsTheFlowToCreateTheUser() {
        //theActorInTheSpotlight().attemptsTo(createUser());
        theActorInTheSpotlight().attemptsTo(
                Click.on(USUARIOS),
                Enter.theValue(obtener("identificador")).into(TXT_BUSCAR),
                Click.on(BUSCAR),
                Esperar.esperarEnSegundos(3000)
        );
    }


    @Then("^the user will be able to visualize the created user$")
    public void theUserWillBeAbleToVisualizeTheCreatedUser() {
        //theActorInTheSpotlight().should(seeThat(validateUser()));
        theActorInTheSpotlight().should(seeThat(userValidate()));
    }
}
