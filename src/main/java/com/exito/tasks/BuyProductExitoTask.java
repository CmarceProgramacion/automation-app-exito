package com.exito.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.userinterfaces.BuyProductExitoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuyProductExitoTask implements Task {

    private String productCategory;
    private String productName;
    private String country;
    private String store;

    public BuyProductExitoTask(String productCategory, String productName, String country, String store) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.country = country;
        this.store = store;
    }

    public static Performable withTheData(String productCategory, String productName, String country, String store) {
        return Tasks.instrumented(BuyProductExitoTask.class, productCategory, productName, country, store);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOCATION_POP_UP),
                 Check.whether(theVideoIsVisible()).andIfSo(Click.on(ICON_VIDEO)),
                Click.on(ADDRESS_BTN),
                WaitUntil.the(RECEIVE_ORDER_POP_UP, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(RECEIVE_ORDER_POP_UP),
                Click.on(CITY_DROP_DOWN_LIST1),
                SendKeys.of(country).into(CITY_DROP_DOWN_LIST2),
                Click.on(STORE_DROP_DOWN_LIST),
                Click.on(STORE_DROP_DOWN_LIST),
                SendKeys.of(store).into(STORE_DROP_DOWN_LIST),
                Click.on(BUTTON_CONTINUE),
                Click.on(BUTTON_CONTINUE)
        );

        actor.attemptsTo(
                //   Click.on(BUTTON_CONTINUE),
                Check.whether(theButtonLocationIsVisible()).andIfSo(Click.on(TOUCH_OUTSIDE)),
                Click.on(INPUT_PRODUCT_SEARCH),
                Enter.theValue(productCategory).into(INPUT_PRODUCT_SEARCH_TWO),
                Click.on(ICON_SEARCH)
        );


        actor.attemptsTo(
                Check.whether(theButtonLocationIsVisible()).andIfSo(Click.on(BUTTON_CONTINUE)).otherwise(Click.on(LABEL_PRODUCT_NAME.of(store))),
                Check.whether(theButtonLocationIsVisible()).andIfSo(Click.on(BUTTON_CONTINUE)).otherwise(Click.on(BUTTON_ADD)),
                Check.whether(theButtonLocationIsVisible()).andIfSo(Click.on(BUTTON_CONTINUE)).otherwise(Click.on(ICON_SHOPPING_CART))
        );

    }

    private Question<Boolean> theButtonLocationIsVisible() {
        return actor -> BUTTON_CONTINUE.resolveFor(actor).isCurrentlyVisible();
    }

    private Question<Boolean> theVideoIsVisible() {
        return actor -> ICON_VIDEO.resolveFor(actor).isCurrentlyVisible();
    }
}
