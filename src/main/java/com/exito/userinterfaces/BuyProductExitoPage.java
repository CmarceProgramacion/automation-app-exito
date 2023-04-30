package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProductExitoPage extends PageObject {
    public static final Target LOCATION_POP_UP = Target.the("location pop-up window").located(By.id("com.android.permissioncontroller:id/permission_deny_button"));
    public static final Target CLOSE_VIDEO_ICON = Target.the("Video close icon").located(By.id("com.exito.appcompania:id/imageview_close"));
    public static final Target PRODUCT_SEARCH_INPUT = Target.the("Text box for product search").located(By.id("com.exito.appcompania:id/appCompatEditText_search_bar"));
    public static final Target PRODUCT_SEARCH_TWO_INPUT = Target.the("Text box for product search").located(By.id("com.exito.appcompania:id/appCompatEditText_search_data_edit"));
    public static final Target SEARCH_ICON = Target.the("Icon to perform product search").located(By.id("com.exito.appcompania:id/text_input_start_icon"));
    public static final Target RECEIVE_ORDER_POP_UP = Target.the("Pop-up window to select how to receive the product").located(By.id("com.exito.appcompania:id/appCompatTextView_buy_and_collect_title"));
    public static final Target CITY_DROP_DOWN_LIST = Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/CustomEditText_city"));
    public static final Target CITY_DROP_DOWN_LIST_TWO = Target.the("Drop-down list of cities").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_city"));
    public static final Target STORE_DROP_DOWN_LIST = Target.the("Drop-down list of store").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_store"));
    public static final Target CONTINUE_BUTTON = Target.the("Button to proceed to checkout and pickup").located(By.id("com.exito.appcompania:id/appCompatButton_continue"));
    public static final Target PRODUCT_NAME_LABEL = Target.the("Product name label").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target ADD_SHOPPING_CART_BUTTON = Target.the("Button to add to shopping cart").located(By.id("com.exito.appcompania:id/add_to_cart_button"));
    public static final Target SHOPPING_CART_ICON = Target.the("Icon to check the shopping cart").located(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));
    public static final Target TOUCH_OUTSIDE = Target.the("touch_outside").located(By.id("com.exito.appcompania:id/touch_outside"));
    public static final Target ADDRESS_BUTTON = Target.the("Direction button").located(By.id("com.exito.appcompania:id/appCompaTextView_address"));
    public static final Target PRODUCT_NAME_CART_LABEL = Target.the("Product cart name  label").locatedBy("//android.view.View[@text='{0}']");
}
