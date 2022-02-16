package co.com.inconcert.testing.fdr.userinterfaces.createuser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage extends PageObject {

    public static final Target USUARIOS = Target.the("Seleccionar Usuarios").located(By.xpath("//*[@id=\"conf_application_actions\"]/li[2]"));
    public static final Target CREAR_USUARIO = Target.the("Desplegar dias").located(By.id("conf_view_button_new"));
    public static final Target IDENTIFICADOR_USER = Target.the("Identificador").located(By.xpath("//input[@id=\"adm_form_user_id\"]"));
    public static final Target FIRST_NAME = Target.the("Primer nombre").located(By.xpath("//input[@id='adm_form_user_first_name']"));
    public static final Target SURNAME = Target.the("Primer apellido").located(By.xpath("//input[@id='adm_form_user_first_surname']"));
    public static final Target PASSWORD = Target.the("Contraseña").located(By.xpath("//input[@id='adm_form_user_pwd']"));
    public static final Target PASSWORD_VERIFY = Target.the("Verificar contraseña").located(By.xpath("//input[@id='adm_form_user_pwd_confirmation']"));
    public static final Target PERMISOS_CLIC = Target.the("Desplegar permisos").located(By.xpath("//select[@id='adm_form_user_role']"));
    public static final Target SELECCIONAR_PERMISOS = Target.the("Seleccionar permisos").located(By.xpath("//select[@id='adm_form_user_role']/option[6]"));
    public static final Target LENGUAJE_CLIC = Target.the("Desplegar lenguaje").located(By.xpath("//select[@id='adm_form_user_app_language']"));
    public static final Target SELECCIONAR_LENGUAJE = Target.the("Seleccioanr lenguaje").located(By.xpath("//select[@id='adm_form_user_app_language']/option[3]"));
    public static final Target HORARIO_CLIC = Target.the("Desplegar Horario").located(By.xpath("//select[@id='adm_form_user_timezone']"));
    public static final Target HORARIO = Target.the("Seleccionar horario").located(By.xpath("//select[@id='adm_form_user_timezone']/option[31]"));
    public static final Target PAIS_CLIC = Target.the("Desplegar pais").located(By.xpath("//select[@id='adm_form_user_country']"));
    public static final Target PAIS = Target.the("Seleccionar pais").located(By.xpath("//select[@id='adm_form_user_country']/option[37]"));
    public static final Target AREA_CLIC = Target.the("Desplegar area").located(By.xpath("//select[@id='adm_form_user_area']"));
    public static final Target AREA = Target.the("Seleccioanr area").located(By.xpath("//select[@id='adm_form_user_area']/option[10]"));
    public static final Target CAMPAÑA = Target.the("Seleccionar campaña").located(By.xpath("//input[@id='opt_usu_cmp_pruebachat']"));
    public static final Target CAMPAÑA_PREDETERMINADA = Target.the("Seleccionar campaña").located(By.xpath("//input[@id='opt_usu_cmp_pruebachat_def_camp']"));
    public static final Target BTN_CONFIRMAR = Target.the("BTN_CONFIRMAR").located(By.xpath("//button[@id='conf_form_button_save']"));
    public static final Target BTN_CONFIRMAR_CONTINUAR = Target.the("Ingresar umbrales").located(By.xpath("//button[@id='conf_form_button_save_and_continue']"));
    public static final Target BTN_ATRAS = Target.the("Boton para confirmar cuentas").located(By.xpath("//button[@id='conf_form_button_cancel']"));
    public static final Target TXT_BUSCAR = Target.the("Ingresa el avlor a buscar").located(By.id("conf_filter_text"));
    public static final Target BUSCAR= Target.the("Clic en buscar").located(By.id("conf_filter_button"));
    public static final Target USUARIOCREADO= Target.the("valida campaña").located(By.xpath("//*[@id=\"conf_view_grid\"]/tbody/tr/td[2]"));
    public static final Target CAMPAÑA_BTN= Target.the("valida campaña").located(By.xpath("//*[@id=\"conf_application_actions\"]/li[1]"));
    public static final Target SALIR= Target.the("Clic en buscar").located(By.xpath("//div[@id='headerManagmentButton']"));
    public static final Target SALIR_DOS= Target.the("Clic en buscar").located(By.xpath("//div[@id=\"quickManagementContainer\"]"));
    public static final Target CERRAR_SESION= Target.the("valida campaña").located(By.id("headerCloseButton"));

}
