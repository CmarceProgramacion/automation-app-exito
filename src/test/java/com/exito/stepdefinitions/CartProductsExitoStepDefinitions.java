package com.exito.stepdefinitions;

import com.exito.tasks.BuyProductExitoTask;
import com.exito.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartProductsExitoStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Exito");
    }


    @Given("that I access the app of the Exito")
    public void thatIAccessTheAppOfTheExito(List<List<String>> dataArticle) {
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisMobileDevice));
        theActorInTheSpotlight().attemptsTo(LoginTask.withTheData(dataArticle.get(0).get(0), dataArticle.get(0).get(1)));

    }

    @When("I select items to purchase")
    public void iLogInAndSelectItemsToPurchase(List<List<String>> dataArticle) {

        theActorInTheSpotlight().attemptsTo(BuyProductExitoTask.withTheData(dataArticle.get(0).get(0),dataArticle.get(0).get(1), dataArticle.get(0).get(2), dataArticle.get(0).get(3)));
    }

    @Then("Verification of the items in my shopping cart")
    public void verificationOfTheItemsInMyShoppingCart() {
    }
}
