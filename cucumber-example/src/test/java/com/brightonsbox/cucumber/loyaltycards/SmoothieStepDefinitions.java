package com.brightonsbox.cucumber.loyaltycards;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SmoothieStepDefinitions {

    private DrinkCatalog drinkCatalog = new DrinkCatalog();
    private SmoothieSchema smoothieSchema = new SmoothieSchema(drinkCatalog);
    private MorningFreshnessMember michael;

    @Given("^(.*) is a Morning Freshness Member$")
    public void michael_is_a_Morning_Freshness_Member(final String name) {
        michael = new MorningFreshnessMember(name, smoothieSchema);
    }

    @Given("the following drink categories:")
    public void the_following_drink_categories(final List<Map<String, String>> drinkCategories) {
        drinkCategories.forEach(
                drinkCategory -> {
                    String drink = drinkCategory.get("Drink");
                    String category = drinkCategory.get("Category");
                    Integer points = Integer.parseInt(drinkCategory.get("Points"));

                    drinkCatalog.addDrink(drink, category);
                    smoothieSchema.setPointsPerCategory(category, points);
                }
        );
    }

    @When("^(.*) purchases (\\d+) (.*) drinks?$")
    public void michael_purchases_drinks(final String name, final Integer amount, final String drink) {
        michael.orders(amount, drink);
    }

    @Then("he should earn {int} points")
    public void he_should_earn_points(final Integer points) {
        assertThat(michael.getPoints()).isEqualTo(points);
    }
}
