package co.com.inconcert.testing.fdr.utilities.javascript;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;

import static co.com.inconcert.testing.fdr.userinterfaces.chat.ChatPage.INGRESAR_CHAT;

public class JavaScript implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        ((JavascriptExecutor)actor).executeScript("arguments[0].disabled = false", INGRESAR_CHAT);

    }

    public static JavaScript onJavaScript(){
        return Tasks.instrumented(JavaScript.class);
    }

}
