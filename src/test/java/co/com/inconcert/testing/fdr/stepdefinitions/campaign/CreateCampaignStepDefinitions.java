package co.com.inconcert.testing.fdr.stepdefinitions.campaign;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.inconcert.testing.fdr.questions.campaign.ValidateCampaign.validateCampaign;
import static co.com.inconcert.testing.fdr.tasks.campaign.CreateCampaign.createCampaign;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CreateCampaignStepDefinitions {

    @When("^the user performs the flow to create the campaign$")
    public void theUserPerformsTheFlowToCreateTheCampaign(){

        theActorInTheSpotlight().attemptsTo(createCampaign());


    }

    @Then("^the user will be able to visualize the created campaign$")
    public void theUserWillBeAbleToVisualizeTheCreatedCampaign(){

        theActorInTheSpotlight().should(seeThat(validateCampaign()));

    }


}
