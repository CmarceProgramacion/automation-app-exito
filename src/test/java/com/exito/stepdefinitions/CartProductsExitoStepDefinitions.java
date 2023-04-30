package com.exito.stepdefinitions;

import com.exito.models.ProductModel;
import com.exito.questions.VerifyProductNames;
import com.exito.tasks.BuyProductExitoTask;
import com.exito.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
        OnStage.theActor("Pepito");
    }

    @Given("that I access the app of the Exito")
    public void thatIAccessTheAppOfTheExito(List<List<String>> dataUser) {
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisMobileDevice));
        theActorInTheSpotlight().attemptsTo(LoginTask.withTheData(dataUser.get(0).get(0), dataUser.get(0).get(1)));
    }

    @When("I add product to cart")
    public void iAddProductToCart(List<List<String>> productData) {
        theActorInTheSpotlight().attemptsTo(BuyProductExitoTask.withTheData(new ProductModel(productData.get(0))));
    }

    @Then("I verify the item in my shopping cart")
    public void iVerifyTheItemInMyShoppingCart(List<List<String>> dataArticle) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerifyProductNames.verify(dataArticle.get(0).get(0)))
        );
    }
}