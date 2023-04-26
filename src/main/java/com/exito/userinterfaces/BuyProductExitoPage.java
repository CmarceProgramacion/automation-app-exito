package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProductExitoPage extends PageObject {

    public static final Target LOCATION_POP_UP  = Target.the("location pop-up window").located(By.id("com.android.permissioncontroller:id/permission_deny_button"));
    public static final Target ICON_VIDEO = Target.the("location pop-up window").located(By.id("com.exito.appcompania:id/imageview_close"));
    public static final Target INPUT_PRODUCT_SEARCH = Target.the("label to be selected to represent the product category").located(By.id("com.exito.appcompania:id/appCompatEditText_search_bar"));
    public static final Target INPUT_PRODUCT_SEARCH_TWO = Target.the("label to be selected to represent the product category").located(By.id("com.exito.appcompania:id/appCompatEditText_search_data_edit"));
    public static final Target ICON_SEARCH = Target.the("label to be selected to represent the product category").located(By.id("com.exito.appcompania:id/text_input_start_icon"));
    public static final Target RECEIVE_ORDER_POP_UP= Target.the("Pop-up window to select how to receive the product").located(By.id("com.exito.appcompania:id/appCompatTextView_buy_and_collect_title"));
    public static final Target CITY_DROP_DOWN_LIST1= Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/CustomEditText_city"));
    public static final Target CITY_DROP_DOWN_LIST2= Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_city"));
    public static final Target CITY_DROP_DOWN_LIST3= Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_store"));
    public static final Target STORE_DROP_DOWN_LIST= Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_store"));
    public static final Target LABEL_PRODUCT_NAME =Target.the("Drop-down list of cities").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target BUTTON_CONTINUE= Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/appCompatButton_continue"));
    public static final Target BUTTON_ADD = Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/buy_now_button"));
    public static final Target ICON_SHOPPING_CART = Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));
    public static final Target TOUCH_OUTSIDE = Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/touch_outside"));
    public static final Target ADDRESS_BTN = Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/appCompaTextView_address"));



}
