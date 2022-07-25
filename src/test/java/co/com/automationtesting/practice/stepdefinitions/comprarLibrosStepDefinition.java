package co.com.automationtesting.practice.stepdefinitions;

import co.com.automationtesting.practice.Questions.ValidarExistenciaElemento;
import co.com.automationtesting.practice.tasks.AgregarLibrosAlCarritoDeCompras;
import co.com.automationtesting.practice.tasks.VercarritodeCompra;
import co.com.automationtesting.practice.user_interfaces.AutomationtestingCheckoutPage;
import co.com.automationtesting.practice.utils.DriverControler;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import groovy.transform.ToString;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionConsequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.ContainsTextMatcher;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.hamcrest.Matchers;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.mockito.internal.matchers.Contains;
import org.mockito.internal.matchers.Equals;

import javax.naming.PartialResultException;
import java.io.IOException;
import java.util.Map;

import static co.com.automationtesting.practice.user_interfaces.AutomationtestingCheckoutPage.TXT_PRECIO_TOTAL;


public class comprarLibrosStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en la pagina de compras de practice\\.automationtesting$")
    public void queMeEncuentroEnLaPaginaDeComprasDePracticeAutomationtesting() {
        OnStage.theActorCalled("kevin").can(BrowseTheWeb.with(DriverControler.chromeHisBrowserWeb().on("https://practice.automationtesting.in/shop/")));

    }


    @Cuando("^compro (\\d+) unidades del libro Android Quick Start Guide$")
    public void comproUnidadesDelLibroAndroidQuickStartGuide(String cantidad, Map<String, String> data) {

        OnStage.theActorInTheSpotlight().attemptsTo(AgregarLibrosAlCarritoDeCompras.on(cantidad),
                VercarritodeCompra.in(data));

    }

    @Entonces("^verifico que el  sea el correcto (.*)$")
    public void verificoQueElSeaElCorrecto(String precioFinal) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_PRECIO_TOTAL),WebElementStateMatchers.containsText(precioFinal)));

    }
}






