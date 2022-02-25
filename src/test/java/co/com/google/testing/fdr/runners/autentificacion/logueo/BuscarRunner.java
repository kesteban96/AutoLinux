package co.com.google.testing.fdr.runners.autentificacion.logueo;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features ="src/test/resources/features/autentificacion/logueo/buscar_palabra.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"co.com.google.testing.fdr.stepdefinitions.autentificacion.logueo"}
)
@RunWith(CucumberWithSerenity.class)
public class BuscarRunner {
}
