package co.com.google.testing.fdr.tasks.opensite;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.testing.fdr.interactions.comunes.Esperar;
import co.com.google.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage;
import co.com.google.testing.fdr.utilities.properties.PropertiesProject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

public class OpenSiteTask implements Task {

    LoginPage usuario = new LoginPage();

    public static OpenSiteTask openSiteGoogle()
    {
        Esperar.esperarEnSegundos(15000);
        return (OpenSiteTask) instrumented(OpenSiteTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String strUrl = "";
        try {
            strUrl = PropertiesProject.getUrlGoogle();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!strUrl.isEmpty() && !strUrl.equals("")) {
            //Metodo Open Absoluto
            usuario.openUrl(strUrl);
        }
    }
}
