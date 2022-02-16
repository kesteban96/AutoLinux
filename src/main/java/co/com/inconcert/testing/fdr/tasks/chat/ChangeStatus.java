package co.com.inconcert.testing.fdr.tasks.chat;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.inconcert.testing.fdr.userinterfaces.chat.ChatPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChangeStatus implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECCIONAR_ESTADO),
                Esperar.esperarEnSegundos(5000),
                Click.on(ESTADO),
                Esperar.esperarEnSegundos(10000),
                WaitUntil.the(CERRAR, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(CERRAR),
                Click.on(EN_VIVO),
                Esperar.esperarEnSegundos(1000)
        );

    }

    public static ChangeStatus changeStatus(){
        return instrumented(ChangeStatus.class);
    }
}
