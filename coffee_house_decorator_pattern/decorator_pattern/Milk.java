package com.software_design.decorator_pattern;

public class Milk extends IngredientDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with milk";
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 2;
    }
}
