package com.brightonsbox.cucumber.loyaltycards;

import java.util.HashMap;
import java.util.Map;

public class SmoothieSchema {

    private final Map<String, Integer> pointsPerCategory = new HashMap<>();
    private final DrinkCatalog catalog;

    public SmoothieSchema(final DrinkCatalog catalog) {
        this.catalog = catalog;
    }

    public void setPointsPerCategory(final String category, final Integer points) {
        pointsPerCategory.put(category, points);
    }

    public int getPointsFor(String drink) {
        return pointsPerCategory.get(categoryOf(drink));
    }

    private String categoryOf(final String drink) {
        return catalog.getCategoryOf(drink);
    }
}
