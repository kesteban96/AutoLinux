package co.com.inconcert.testing.fdr.runners.autentificacion.logueo;

import co.com.inconcert.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.inconcert.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.inconcert.testing.fdr.utilities.runner.RunnerInConcert;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.inconcert.testing.fdr/features/autentificacion/logueo/logueo_exitoso.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.inconcert.testing.fdr.stepdefinitions.autentificacion.logueo"}
)
@RunWith(RunnerInConcert.class)

public class AutentificacionRunner {

    public AutentificacionRunner() {
    }

    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.inconcert.testing.fdr/features/autentificacion/logueo");
    }
}
