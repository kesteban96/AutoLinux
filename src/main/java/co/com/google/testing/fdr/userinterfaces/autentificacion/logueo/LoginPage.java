package co.com.google.testing.fdr.userinterfaces.autentificacion.logueo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.By;

@NamedUrls({
        @NamedUrl(name = "open.google", url = "http://{1}"),
})

public class LoginPage extends PageObject {

    public static final Target BUSCAR = Target.the("Buscar").located(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
    public static final Target CLICK_UNO = Target.the("Click").located(By.xpath("/html/body/div[1]/div[2]/div/img"));
    public static final Target CLICK_DOS = Target.the("Boton para ingresar").located(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
    public static final Target TXT_VALIDADOR = Target.the("Login").located(By.xpath("//*[@id=\"sports-app\"]/div/div[1]/div/div/div/div/div[2]/div[2]"));

}
