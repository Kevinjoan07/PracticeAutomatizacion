package co.com.automationtesting.practice.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/comprar_libros.feature",
        glue = "co.com.automationtesting.practice.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class comprarLibros {
}
