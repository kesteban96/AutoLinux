package co.com.inconcert.testing.fdr.questions.chat;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.inconcert.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage.TXT_INICIO_LOGIN;
import static co.com.inconcert.testing.fdr.userinterfaces.chat.ChatPage.*;
import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.*;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;


public class TextValidate implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String valor = TEXT_VALIDATE.resolveFor(actor).getValue();
        String valor2 = TEXT_VALIDATE.resolveFor(actor).getText();
        System.out.println(valor);
        System.out.println(valor2);
        Boolean respuesta = false;

        actor.attemptsTo(
                Check.whether(TEXT_VALIDATE.resolveFor(actor).getText().equals(obtener("cuenta"))).andIfSo(
                        Esperar.esperarEnSegundos(1000),
                        Click.on(SALIR),
                        Esperar.esperarEnSegundos(5000),
                        Click.on(CERRAR_SESION)
                )
        );
         respuesta= true;
        return respuesta;
    }

    public static TextValidate textValidate(){
        return new TextValidate();
    }
}
