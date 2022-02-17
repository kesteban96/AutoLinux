package co.com.google.testing.fdr.questions.autentificacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.google.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage.*;



public class VerResultadosQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String valor = TXT_VALIDADOR.resolveFor(actor).getValue();
        String valor2 = TXT_VALIDADOR.resolveFor(actor).getText();
        System.out.println(valor);
        System.out.println(valor2);

        return TXT_VALIDADOR.resolveFor(actor).isPresent();
    }

    public static VerResultadosQuestion verResultados(){

        return new VerResultadosQuestion();
    }

}
