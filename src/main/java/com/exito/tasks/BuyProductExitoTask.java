package com.exito.tasks;

import com.exito.interactions.WaitImplicitAction;
import com.exito.models.ProductModel;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.userinterfaces.BuyProductExitoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuyProductExitoTask implements Task {

    private String productCategory;
    private String productName;
    private String country;
    private String store;

    public BuyProductExitoTask(ProductModel productModel) {
        this.productCategory = productModel.getProductCategory();
        this.productName = productModel.getProductName();
        this.country = productModel.getCountry();
        this.store = productModel.getStore();
    }

    public static Performable withTheData(ProductModel productModel) {
        return Tasks.instrumented(BuyProductExitoTask.class, productModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOCATION_POP_UP),
                Check.whether(theVideoIsVisible()).andIfSo(Click.on(CLOSE_VIDEO_ICON)),
                Click.on(ADDRESS_BUTTON),
                WaitUntil.the(RECEIVE_ORDER_POP_UP, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(RECEIVE_ORDER_POP_UP),
                Click.on(CITY_DROP_DOWN_LIST),
                SendKeys.of(country).into(CITY_DROP_DOWN_LIST_TWO),
                Click.on(STORE_DROP_DOWN_LIST),
                Click.on(STORE_DROP_DOWN_LIST),
                SendKeys.of(store).into(STORE_DROP_DOWN_LIST),
                Click.on(CONTINUE_BUTTON),
                Click.on(CONTINUE_BUTTON)
        );

        actor.attemptsTo(
                Check.whether(theButtonLocationIsVisible()).andIfSo(Click.on(TOUCH_OUTSIDE)),
                Click.on(PRODUCT_SEARCH_INPUT),
                Enter.theValue(productCategory).into(PRODUCT_SEARCH_TWO_INPUT),
                Click.on(SEARCH_ICON)
        );

        actor.attemptsTo(
                Check.whether(theButtonLocationIsVisible()).andIfSo(Click.on(CONTINUE_BUTTON)).otherwise(Click.on(PRODUCT_NAME_LABEL.of(productName)),
                        Click.on(ADD_SHOPPING_CART_BUTTON),
                        Click.on(SHOPPING_CART_ICON))
        );

        actor.attemptsTo(
                WaitImplicitAction.inSeconds(10),
                WaitUntil.the(PRODUCT_NAME_CART_LABEL.of(productName), isCurrentlyVisible()).forNoMoreThan(10).seconds()
        );
    }

    private Question<Boolean> theButtonLocationIsVisible() {
        return actor -> CONTINUE_BUTTON.resolveFor(actor).isCurrentlyVisible();
    }

    private Question<Boolean> theVideoIsVisible() {
        return actor -> CLOSE_VIDEO_ICON.resolveFor(actor).isCurrentlyVisible();
    }
}