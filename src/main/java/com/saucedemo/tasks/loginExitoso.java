package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.saucedemo.ui.loginPage.*;

public class loginExitoso implements Task {


    public String user, password;

    public loginExitoso(String  user, String pass){
        this.user= user;
        this.password= pass;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(USUARIO),
                Enter.theValue(password).into(PASSWORD),
                Click.on(BTN_SUBMIT));

    }


    public static loginExitoso on(String  user, String pass){
        return Instrumented.instanceOf(loginExitoso.class).withProperties(user,pass);
    }
}
