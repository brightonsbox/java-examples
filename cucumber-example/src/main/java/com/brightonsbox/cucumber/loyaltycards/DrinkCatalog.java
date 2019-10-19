package com.brightonsbox.cucumber.loyaltycards;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

    final Map<String, String> drinkCategories = new HashMap<>();

    public void addDrink(final String drink, final String category) {
        drinkCategories.put(drink, category);
    }

    public String getCategoryOf(final String drink) {
        return drinkCategories.get(drink);
    }
}
