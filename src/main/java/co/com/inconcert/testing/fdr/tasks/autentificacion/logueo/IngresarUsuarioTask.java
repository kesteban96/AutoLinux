package co.com.inconcert.testing.fdr.tasks.autentificacion.logueo;

import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import co.com.inconcert.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarUsuarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("name")).into(LoginPage.CAMPO_USER_NAME),
                Enter.theValue(obtener("password")).into(LoginPage.CAMPO_PASSWORD),
                Click.on(LoginPage.BTN_CONTINUAR),
                Esperar.esperarEnSegundos(12000)
        );
    }

    public static IngresarUsuarioTask ingresarUsuario () {
        return instrumented(IngresarUsuarioTask.class);
    }
}