package co.com.google.testing.fdr.tasks.autentificacion.logueo;

import static co.com.google.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.testing.fdr.interactions.comunes.Esperar;
import co.com.google.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarUsuarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("palabra")).into(LoginPage.BUSCAR),
                Click.on(LoginPage.CLICK_UNO),
                Click.on(LoginPage.CLICK_DOS),
                Esperar.esperarEnSegundos(12000)
        );
    }

    public static IngresarUsuarioTask ingresarValor() {
        return instrumented(IngresarUsuarioTask.class);
    }
}