package co.com.inconcert.testing.fdr.runners.autentificacion.logueo;

import co.com.inconcert.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.inconcert.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.inconcert.testing.fdr.utilities.runner.RunnerInConcert;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.inconcert.testing.fdr/features/autentificacion/logueo/logueo_exitoso.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.inconcert.testing.fdr.stepdefinitions.autentificacion.logueo"}
)
@RunWith(CucumberWithSerenity.class)

public class AutentificacionRunner {

    public AutentificacionRunner() {
    }

}
