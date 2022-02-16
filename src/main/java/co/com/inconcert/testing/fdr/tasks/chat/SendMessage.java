package co.com.inconcert.testing.fdr.tasks.chat;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.inconcert.testing.fdr.userinterfaces.chat.ChatPage.*;
import static co.com.inconcert.testing.fdr.utilities.robot.Robot.conRobot;

public class SendMessage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIR_CHAT),
                Esperar.esperarEnSegundos(2500),
                conRobot(),
                Esperar.esperarEnSegundos(5000)
                //Enter.theValue(obtener("message")).into(INGRESAR_CHAT)
            );

    }


    public static SendMessage sendmessage(){
        return (SendMessage) Tasks.instrumented(SendMessage.class);
    }
}
