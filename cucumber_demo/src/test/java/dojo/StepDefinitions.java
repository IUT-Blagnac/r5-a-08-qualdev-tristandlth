package dojo;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class StepDefinitions {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void person_who_wants_to_buy_a_drink(String ownerName) {
        order = new Order();
        order.declareOwner(ownerName);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String targetName) {
        order.declareTarget(targetName);
    }

    @Then("there are {int} cocktails in the order")
    public void there_are_cocktails_in_the_order(int numberOfCocktails) {
        List<String> cocktails = order.getCocktails();
        assertEquals(numberOfCocktails, cocktails.size(), "The number of cocktails in the order is incorrect.");
    }
}