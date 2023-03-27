package com.saucedemo.StepDefinitions;

import com.saucedemo.utils.DriverControler;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.saucedemo.tasks.loginExitoso;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static com.saucedemo.ui.HomePage.TXT_HEADER;

public class loginStepDefinition {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^ingreso a la pagina de \"([^\"]*)\"$")
    public void ingresoALaPaginaDe(String url) {
        OnStage.theActorCalled("kevin").can(BrowseTheWeb.with(DriverControler.chromeHisBrowserWeb().on(url)));
    }


    @When("^ingreso \"([^\"]*)\" y \"([^\"]*)\"$")
    public void ingresoY(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(loginExitoso.on(user, pass));
    }

    @Then("^valido en pantalla el mensaje \"([^\"]*)\"$")
    public void validoEnPantallaElMensaje(String titulo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_HEADER), WebElementStateMatchers.containsOnlyText(titulo)));

    }

}
