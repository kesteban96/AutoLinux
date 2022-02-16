package co.com.inconcert.testing.fdr.runners.createuser;


import co.com.inconcert.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.inconcert.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.inconcert.testing.fdr.utilities.runner.RunnerInConcert;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.inconcert.testing.fdr/features/createuser/createuser.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.inconcert.testing.fdr.stepdefinitions"}
)
@RunWith(RunnerInConcert.class)
public class CreateUser {

    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.inconcert.testing.fdr/features/createuser");
    }

}
