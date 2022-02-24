package co.com.google.testing.fdr.runners.autentificacion.logueo;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features ="src/test/resources/features/autentificacion/logueo/logueo_exitoso.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"co.com.google.testing.fdr.stepdefinitions.autentificacion.logueo"}
)
@RunWith(CucumberWithSerenity.class)

public class AutentificacionRunner {

    public AutentificacionRunner() {
    }

}
