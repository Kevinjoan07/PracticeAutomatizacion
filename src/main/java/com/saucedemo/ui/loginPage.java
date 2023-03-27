package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginPage {
    public static final Target USUARIO = Target.the("ingresar el usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("ingresar la contraseña").located(By.id("password"));
    public static final Target BTN_SUBMIT = Target.the("Presiona el boton ingresar").located(By.id("login-button"));

}
