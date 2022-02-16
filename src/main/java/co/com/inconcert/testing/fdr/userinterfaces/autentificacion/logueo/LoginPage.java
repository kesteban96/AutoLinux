package co.com.inconcert.testing.fdr.userinterfaces.autentificacion.logueo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.By;

@NamedUrls({
        @NamedUrl(name = "open.inconcert", url = "http://{1}"),
})

public class LoginPage extends PageObject {

    public static final Target CAMPO_USER_NAME = Target.the("Nombre del usuario").located(By.xpath("//*[@id=\"username\"]"));
    public static final Target CAMPO_PASSWORD = Target.the("Contraseña").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target BTN_CONTINUAR = Target.the("Boton para ingresar").located(By.id("submitButton"));
    public static final Target TXT_INICIO_LOGIN = Target.the("Login").located(By.xpath("//*[@id=\"int_conversations_navigation\"]/ul/li[1]/label"));

}
