package co.com.inconcert.testing.fdr.stepdefinitions.chat;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static co.com.inconcert.testing.fdr.questions.chat.TextValidate.textValidate;
import static co.com.inconcert.testing.fdr.tasks.chat.ChangeStatus.changeStatus;
import static co.com.inconcert.testing.fdr.tasks.chat.SendMessage.sendmessage;
import static co.com.inconcert.testing.fdr.tasks.opensite.OpenSiteSnippet.openSiteSnippet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ChatStepdefinitions {


    @Given("^customer chat send message$")
    public void customerChatSendMessage() throws Exception {
        theActorInTheSpotlight().attemptsTo(openSiteSnippet(),
                Esperar.esperarEnSegundos(2000),
                sendmessage()
                );
    }

    @When("^user changes status to online$")
    public void userChangesStatusToOnline()  {

        theActorInTheSpotlight().attemptsTo(changeStatus());
   }

    @Then("^the user can validate the message$")
    public void theUserCanValidateTheMessage(){

        theActorInTheSpotlight().should(
                seeThat(textValidate()
                ));

    }
}
