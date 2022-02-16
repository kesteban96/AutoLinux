package co.com.inconcert.testing.fdr.questions.autentificacion;

import co.com.inconcert.testing.fdr.interactions.comunes.Change;
import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;



import static co.com.inconcert.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage.*;
import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.*;
import static co.com.inconcert.testing.fdr.utilities.constant.ConstantInConcert.STATUS;


public class ValidarLoginQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String valor = TXT_INICIO_LOGIN.resolveFor(actor).getValue();
        String valor2 = TXT_INICIO_LOGIN.resolveFor(actor).getText();
        System.out.println(valor);
        System.out.println(valor2);

        Boolean respuesta;

        actor.attemptsTo(
                Check.whether(TXT_INICIO_LOGIN.resolveFor(actor).getText().equals("Mis Conversaciones")).andIfSo(
                        Esperar.esperarEnSegundos(1000),
                        Click.on(SALIR),
                        Esperar.esperarEnSegundos(5000),
                        Click.on(CERRAR_SESION),
                        Change.status(true)

                )
                        .otherwise(Change.status(false))
        );

        respuesta= actor.recall(STATUS);

        return respuesta;
    }

    public static ValidarLoginQuestion validarLogin(){

        return new ValidarLoginQuestion();
    }

}
