package co.com.inconcert.testing.fdr.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static co.com.inconcert.testing.fdr.utilities.constant.ConstantInConcert.STATUS;

public class Change implements Interaction {

    static boolean statusfinal;

    public Change(boolean status) {
        this.statusfinal = status;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember(STATUS,statusfinal);

    }

    public static Change status(boolean status){

        return Tasks.instrumented(Change.class,status);
    }
}
