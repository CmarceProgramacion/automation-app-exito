package com.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.exito.userinterfaces.BuyProductExitoPage.PRODUCT_NAME_LBL;

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
