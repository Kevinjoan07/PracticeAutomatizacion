package co.com.automationtesting.practice.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationtestingCheckoutPage {

    public static final Target TXT_NOMBRE= Target.the("").locatedBy("//*/input[@id='billing_first_name']");
    public static final Target TXT_APELLIDO= Target.the("").locatedBy("//*/input[@id='billing_last_name']");
    public static final Target TXT_EMAIL= Target.the("").locatedBy("//*/input[@id='billing_email']");
    public static final Target TXT_TELEFONO= Target.the("").locatedBy("//*/input[@id='billing_phone']");
    public static final Target BTN_PAISES= Target.the("").locatedBy("//*/div[@id='s2id_billing_country']");
    public static final Target TXT_PAIS= Target.the("").locatedBy("//*/input[@id='s2id_autogen1_search']");
    public static final Target BTN_PAIS_SELECCIONADO=Target.the("").locatedBy("//*/ul[@id='select2-results-1']");
    public static final Target TXT_DIRECCION=Target.the("").locatedBy("//*/input[@id='billing_address_1']");
    public static final Target TXT_CIUDAD=Target.the("").locatedBy("//*/input[@id='billing_city']");
    public static final Target TXT_ESTADO =Target.the("").locatedBy("//*/input[@id='billing_state']");
    public static final Target TXT_CODIGO_POSTAL=Target.the("").locatedBy("//*/input[@id='billing_postcode']");
    public static final Target BTN_REALIZAR_PEDIDO=Target.the("").locatedBy("//*/input[@id='place_order']");
    public static final Target TXT_PRECIO_TOTAL=Target.the("").locatedBy("(//span[text()='945.00'])[1]");
}
