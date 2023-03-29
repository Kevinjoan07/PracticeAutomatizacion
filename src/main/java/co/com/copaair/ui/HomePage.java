package co.com.copaair.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target PAIS_ORIGEN =Target.the("El Pais de origen").locatedBy("(//input[@data-name='pbOrigen'])[2]");
    public static final Target PAIS_DESTINO =Target.the("El Pais de destino").locatedBy("(//div[@class='row-input right']/input[@data-name='pbDestino'])[2]");
    public static final Target CAMPO_FECHA_SALIDA =Target.the("Campo Fecha de salida").locatedBy("//input[contains (@data-txt-ida, 'Ida')]");
    public static final Target FECHA_SALIDA =Target.the("Ingresa la Fecha de salida").locatedBy("(//div[@data-day='{0}'])[2]");

    public static final Target CAMPO_FECHA_VUELTA =Target.the("Campo Fecha de salida").locatedBy("//input[contains (@data-txt-regreso, 'Regreso')]");
    public static final Target FECHA_VUELTA =Target.the("Ingresa la Fecha de salida").locatedBy("(//div[@data-day='{0}'])[2]");
    public static final Target PASAJEROS =Target.the("La Cantidad de pasajeros").locatedBy("(//input[contains (@id, 'pbPasajeros')])[2]");
    public static final Target NUMERO_PASAJEROS =Target.the("La Cantidad de pasajeros").locatedBy("(//div[@class='plus control'])[4]");
    public static final Target BTN_BUSCAR_VUELOS =Target.the("Boton Buscar vuelos").locatedBy("(//button[contains(text(),'Buscar vuelos')])[3]");

}
