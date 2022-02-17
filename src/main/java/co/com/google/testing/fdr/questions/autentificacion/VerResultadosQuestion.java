package co.com.google.testing.fdr.questions.autentificacion;

import co.com.google.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;



import static co.com.google.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage.*;



public class ValidarLoginQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String valor = TXT_INICIO_LOGIN.resolveFor(actor).getValue();
        String valor2 = TXT_INICIO_LOGIN.resolveFor(actor).getText();
        System.out.println(valor);
        System.out.println(valor2);



;

        return true;
    }

    public static ValidarLoginQuestion validarLogin(){

        return new ValidarLoginQuestion();
    }

}
