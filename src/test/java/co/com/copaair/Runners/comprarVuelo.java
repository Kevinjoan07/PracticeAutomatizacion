package co.com.copaair.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/comprarvuelo.feature",
        glue = "co.com.copaair.StepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class comprarVuelo {
}
