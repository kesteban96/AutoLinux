package co.com.inconcert.testing.fdr.tasks.opensite;


import co.com.inconcert.testing.fdr.userinterfaces.autentificacion.logueo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSiteSnippet implements Task {

    LoginPage usuario = new LoginPage();

    public static OpenSiteSnippet openSiteSnippet(){
        return (OpenSiteSnippet) instrumented(OpenSiteSnippet.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String strUrl = obtener("url");

        if (!strUrl.isEmpty() && !strUrl.equals("")) {
            usuario.openUrl(strUrl);
        }    }
}
