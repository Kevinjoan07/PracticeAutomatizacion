package co.com.automationtesting.practice.tasks;

import co.com.automationtesting.practice.interations.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.automationtesting.practice.user_interfaces.AutomationtestingCheckoutPage.*;
import static co.com.automationtesting.practice.user_interfaces.AutomationtestingProductoPage.BTN_PROCEED_TO_CHECKOUT;

public class VercarritodeCompra implements Task {

    private String nombre, apellido,email,telefono, pais, direccion, ciudad, estado, codigo;

    public VercarritodeCompra(Map<String,String>data) {
        this.nombre = data.get("nombre");
        this.apellido = data.get("apellido");
        this.email=data.get("email");
        this.telefono=data.get("telefono");
        this.pais=data.get("pais");
        this.direccion = data.get("direccion");
        this.ciudad= data.get("ciudad");
        this.estado= data.get("ciudad");
        this.codigo= data.get("codigozip");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PROCEED_TO_CHECKOUT),
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(apellido).into(TXT_APELLIDO),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(telefono).into(TXT_TELEFONO),
                Click.on(BTN_PAISES),Enter.theValue(pais).into(TXT_PAIS),
                Click.on(BTN_PAIS_SELECCIONADO),Enter.theValue(direccion).into(TXT_DIRECCION),
                Enter.theValue(ciudad).into(TXT_CIUDAD),Enter.theValue(estado).into(TXT_ESTADO),
                Enter.theValue(codigo).into(TXT_CODIGO_POSTAL),Click.on(BTN_REALIZAR_PEDIDO),
                WaitUntil.the(TXT_PRECIO_TOTAL, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()
                );

    }


    public static VercarritodeCompra in(Map<String,String>data){
        return Instrumented.instanceOf(VercarritodeCompra.class).withProperties(data);
    }
}
