package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
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
                Click.on(ICON_VIDEO),
                Click.on(INPUT_PRODUCT_SEARCH),
                WaitUntil.the(RECEIVE_ORDER_POP_UP, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(RECEIVE_ORDER_POP_UP),
                Click.on(CITY_DROP_DOWN_LIST1),
                SendKeys.of(country).into(CITY_DROP_DOWN_LIST2),
                Click.on(STORE_DROP_DOWN_LIST),
                Click.on(STORE_DROP_DOWN_LIST),
                SendKeys.of(store).into(STORE_DROP_DOWN_LIST),
                Click.on(BUTTON_CONTINUE),
                Click.on(BUTTON_CONTINUE),
                Click.on(INPUT_PRODUCT_SEARCH),
                Enter.theValue(productCategory).into(INPUT_PRODUCT_SEARCH_TWO)
                //Click.on(ICON_SEARCH)
                //WaitUntil.the(BUTTON_CONTINUE, isVisible()).forNoMoreThan(3).seconds(),
                // Click.on(BUTTON_OUTSIDE),
                //Click.on(BUTTON_OUTSIDE)


        );
        actor.attemptsTo(

                //
                //
                //Click.on(STORE_DROP_DOWN_LIST),
                //Enter.theValue(store).into(STORE_DROP_DOWN_LIST).thenHit(Keys.ENTER),
                //Click.on(STORE_DROP_DOWN_LIST), Click.on(BUTTON_CONTINUE)
                // Click.on(BUTTON_CONTINUE),
        );

    }
}
