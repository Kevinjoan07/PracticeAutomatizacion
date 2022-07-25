package co.com.automationtesting.practice.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutomationtestingProductoPage {

    public static final Target TXT_CANTIDAD_LIBROS = Target.the(" Cantidad de libros a comprar ").locatedBy("//*/input[@name='quantity']");
    public static final Target BTN_ADD_TO_BASKET = Target.the(" Boton  agregar la cantidad de libros al carrito de compras ").locatedBy("//*/button[@class='single_add_to_cart_button button alt']");
    public static final Target BTN_VIEW_BASKET = Target.the("Boton ver precio final ").locatedBy("//*/a[@class='button wc-forward']");

    public static final Target BTN_PROCEED_TO_CHECKOUT = Target.the("Boton proceder a checkout").locatedBy("//*/a[@class='checkout-button button alt wc-forward']");





}
