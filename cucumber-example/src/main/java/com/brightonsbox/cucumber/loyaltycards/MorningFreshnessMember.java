package com.brightonsbox.cucumber.loyaltycards;

public class MorningFreshnessMember {

    private final String name;
    private SmoothieSchema schema;
    private int points;

    public MorningFreshnessMember(final String name, final SmoothieSchema schema) {
        this.name = name;
        this.schema = schema;
    }

    public void orders(final Integer amount, final String drink) {
        points += amount * schema.getPointsFor(drink);
    }

    public int getPoints() {
        return points;
    }
}
