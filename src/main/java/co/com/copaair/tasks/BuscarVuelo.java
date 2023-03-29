package co.com.copaair.tasks;

import com.saucedemo.utils.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.requirements.reports.ScenarioSummaryOutcome;
import org.openqa.selenium.Keys;

import java.security.Key;

import static co.com.copaair.ui.HomePage.*;

public class BuscarVuelo implements Task {

    public String origen, destino, fecha_Salida, fecha_regreso;

    public BuscarVuelo(String  orig,String fecha_ori, String dest, String fecha_vuelta){
        this.origen= orig;
        this.destino= dest;
        this.fecha_Salida=fecha_ori;
        this.fecha_regreso = fecha_vuelta;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(origen).into(PAIS_ORIGEN).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Enter.theValue(destino).into(PAIS_DESTINO).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Click.on(CAMPO_FECHA_SALIDA), Click.on(FECHA_SALIDA.of(fecha_Salida)),
                Click.on(FECHA_VUELTA.of(fecha_regreso)),Click.on(PASAJEROS),DoubleClick.on(NUMERO_PASAJEROS),
                Click.on(BTN_BUSCAR_VUELOS)
        );


    }

    public static BuscarVuelo on(String  orig,String fecha_salida ,String dest,String fecha_vuelta){
        return Instrumented.instanceOf(BuscarVuelo.class).withProperties(orig,fecha_salida, dest, fecha_vuelta);
    }
}
