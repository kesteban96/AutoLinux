package co.com.inconcert.testing.fdr.userinterfaces.chat;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChatPage extends PageObject {

    public static final Target SELECCIONAR_ESTADO = Target.the("Seleccionar estado").located(By.xpath("//*[@id=\"userLoggedName\"]/div[1]/i"));
    public static final Target ESTADO = Target.the("estado").located(By.xpath("//*[@id='stateChangerPopup']//div[@state_id='ACTIVE']"));
    public static final Target ABRIR_CHAT = Target.the("abrir").located(By.xpath("//*[@id=\"886B7F768CB2EA1EF644632AC0DECBA7_startButtonContainer\"]"));
    public static final Target INGRESAR_CHAT = Target.the("ingresar valor").located(By.xpath("//textarea[@class='chatControlArea']"));
    public static final Target TEXT_VALIDATE = Target.the("texto chat").located(By.xpath("//div[@int_column='account']/label"));
    public static final Target TEXT_CAMPAÑA = Target.the("Se valida que el chat llegue").located(By.xpath("//*[@id=\"ui-id-9\"]"));
    public static final Target CERRAR = Target.the("Boton para ingresar").located(By.xpath("/html/body/div[21]/div[1]/div/button"));
    public static final Target EN_VIVO = Target.the("Boton para ingresar").located(By.xpath("//*[@id=\"int_conversations_navigation\"]/ul/li[3]"));


}
