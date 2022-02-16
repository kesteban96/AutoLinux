package co.com.inconcert.testing.fdr.questions.campaign;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;


import static co.com.inconcert.testing.fdr.userinterfaces.campaign.CampaignPage.CAMPAÑA_CREADA;
import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.CERRAR_SESION;
import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.SALIR;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidateCampaign implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean respuesta = false;

        actor.attemptsTo(
                Check.whether(CAMPAÑA_CREADA.resolveFor(actor).getText().equals(obtener("campaignname"))).andIfSo(
                        Esperar.esperarEnSegundos(1000),
                        Click.on(SALIR),
                        Esperar.esperarEnSegundos(5000),
                        Click.on(CERRAR_SESION)

                )
        );

        return true;
    }

    public static ValidateCampaign validateCampaign(){

        return new ValidateCampaign();
    }

}
