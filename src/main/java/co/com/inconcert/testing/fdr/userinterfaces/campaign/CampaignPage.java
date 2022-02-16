package co.com.inconcert.testing.fdr.userinterfaces.campaign;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CampaignPage extends PageObject {

    public static final Target CREAR_CAMPAÑA = Target.the("Crear campaña").located(By.id("conf_view_button_new"));
    public static final Target NOMBRE = Target.the("ingresar nombre").located(By.xpath("//input[@id=\"adm_form_campaign_name\"]"));
    public static final Target DESCRIPCION = Target.the("ingresa descripcion").located(By.xpath("//input[@id=\"adm_form_campaign_desc\"]"));
    public static final Target CLIC_HORARIO = Target.the("Desplegar Horario").located(By.xpath("//select[@id=\"adm_form_campaign_timezone\"]"));
    public static final Target CLIC_DOS_HORARIO = Target.the("seleccionar horario").located(By.xpath("//*[@id=\"adm_form_campaign_timezone\"]/option[31]"));
    public static final Target BTN_CONFIRMAR = Target.the("Boton confirmar").located(By.xpath("//*[@id=\"conf_form_button_save\"]"));
    public static final Target HORARIOS = Target.the("Boton para Horarios").located(By.xpath("//*[@id=\"conf_application_actions\"]/li[1]/ul/li[6]"));
    public static final Target DESPLEGAR_DIAS = Target.the("Desplegar dias").located(By.id("adm_form_campaign_schedule_day_range_selector"));
    public static final Target SELECCIONAR_SEMANA = Target.the("Seleccionar semana").located(By.xpath("//*[@id=\"adm_form_campaign_schedule_day_range_all_days\"]"));
    public static final Target SELECCIONAR_HORARIO = Target.the("Seleccioanr horario").located(By.xpath("//*[@id=\"adm_form_campaign_schedule_all_days_range\"]"));
    public static final Target BTN_CONFIRMAR_HORARIO = Target.the("Boton para confirmar horario").located(By.id("adm_form_campaign_schedule_save"));
    public static final Target CUENTAS = Target.the("BSeleccionar cuentas").located(By.xpath("//*[@id=\"conf_application_actions\"]/li[1]/ul/li[2]"));
    public static final Target CREAR_CUENTA = Target.the("Crear una cuenta").located(By.id("adm_form_campaign_accounts_new"));
    public static final Target SELECCIONAR_CHAT = Target.the("Seleccionar chat").located(By.xpath("//*[@id=\"conf_form_menu\"]/div[2]"));
    public static final Target TEXT_NOMBRE_CUENTA = Target.the("Nombre cuenta").located(By.xpath("//input[@id=\"adm_form_campaign_accounts_webchat_name\"]"));
    public static final Target DISTRIBUCION = Target.the("Desplegar distribuccion").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_webchat_distribution\"]"));
    public static final Target SELECCIONAR_DISTRIBUCCION = Target.the("Seleccioanr distribuccion").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_webchat_distribution\"]/option[2]"));
    public static final Target IDIOMA = Target.the("Desplega idioma").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_webchat_language\"]"));
    public static final Target SELECCIONAR_IDIOMA = Target.the("Selecciona Idioma").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_webchat_language\"]/option[2]"));
    public static final Target UMBRALES = Target.the("Ingresar umbrales").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_webchat_thresholds_service_level_time\"]"));
    public static final Target BTN_CONFIRMAR_CUENTAS = Target.the("Boton para confirmar cuentas").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_save\"]"));
    public static final Target BTN_CERRAR_POP = Target.the("pop up de confirmacion").located(By.xpath("//*[@id=\"adm_form_campaign_accounts_webchat_snippet_has_changed\"]/div[2]/div[2]/button"));
    public static final Target BTN_ATRAS= Target.the("Atras").located(By.xpath("//*[@id=\"conf_application_actions\"]/li[1]/button/i"));
    public static final Target TXT_BUSCAR = Target.the("Ingresa el avlor a buscar").located(By.id("conf_filter_text"));
    public static final Target BUSCAR= Target.the("Clic en buscar").located(By.id("conf_filter_button"));
    public static final Target CAMPAÑA_CREADA= Target.the("valida campaña").located(By.xpath("//*[@id=\"conf_view_grid\"]/tbody/tr/td[2]"));
}
