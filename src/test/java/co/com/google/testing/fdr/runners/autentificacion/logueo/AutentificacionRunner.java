package co.com.google.testing.fdr.runners.autentificacion.logueo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features ="src/test/resources/features/autentificacion/logueo/logueo_exitoso.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.google.testing.fdr.stepdefinitions.autentificacion.logueo"}
)
@RunWith(CucumberWithSerenity.class)

public class AutentificacionRunner {

    public AutentificacionRunner() {
    }

}
