package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.exito.userinterfaces.LoginExitoPage.*;

public class LoginTask implements Task {

    private String email;
    private String password;

    public LoginTask(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Performable withTheData(String email, String password) {
        return Tasks.instrumented(LoginTask.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON));
    }
}
