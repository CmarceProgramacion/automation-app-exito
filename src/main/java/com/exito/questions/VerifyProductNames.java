package com.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.userinterfaces.BuyProductExitoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class VerifyProductNames implements Question<Boolean> {
    private String name;

    public VerifyProductNames(String name) {
        this.name = name;
    }

    public static VerifyProductNames verify(String name) {
        return new VerifyProductNames(name);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return PRODUCT_NAME_LBL.of(name).isVisibleFor(actor);
    }
}
