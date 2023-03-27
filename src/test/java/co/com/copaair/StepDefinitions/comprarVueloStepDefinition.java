package co.com.copaair.StepDefinitions;

import co.com.copaair.tasks.BuscarVuelo;
import com.saucedemo.utils.DriverControler;
import com.saucedemo.utils.Esperar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.io.IOException;

public class comprarVueloStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ingreso a la \"([^\"]*)\"$")
    public void ingresoALa(String url) {
        OnStage.theActorCalled("Kevin").can(BrowseTheWeb.with(DriverControler.chromeHisBrowserWeb().on(url)));

    }


    @When("^realizo la busqueda de un vuelo desde \"([^\"]*)\" el \"([^\"]*)\", hasta \"([^\"]*)\" el \"([^\"]*)\"$")
    public void realizoLaBusquedaDeUnVueloDesdeElHastaEl(String origen, String fecha_origen, String destino, String fecha_destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarVuelo.on(origen,fecha_origen,destino)
        );
    }

    @Then("^para obtener el mensaje \"([^\"]*)\" en la pagina$")
    public void paraObtenerElMensajeEnLaPagina(String text_validacion) {
        // Write code here that turns the phrase above into concrete actions
    }



}
