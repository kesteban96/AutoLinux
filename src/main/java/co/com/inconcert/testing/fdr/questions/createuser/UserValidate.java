package co.com.inconcert.testing.fdr.questions.createuser;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;


import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.*;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class UserValidate implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String valor = USUARIOCREADO.resolveFor(actor).getValue();
        String valor2 = USUARIOCREADO.resolveFor(actor).getText();
        System.out.println(valor);
        System.out.println(valor2);
        Boolean respuesta = false;
        System.out.println("Ingrese");
        actor.attemptsTo(
                Check.whether(USUARIOCREADO.resolveFor(actor).getText().equals(obtener("identificador"))).andIfSo(
                        Esperar.esperarEnSegundos(1000),
                       Click.on(SALIR),
                       Esperar.esperarEnSegundos(5000),
                      Click.on(CERRAR_SESION)

                )

        );
        respuesta = true;
        return respuesta;
    }

    public static UserValidate userValidate(){

       return new UserValidate();
    }
}
