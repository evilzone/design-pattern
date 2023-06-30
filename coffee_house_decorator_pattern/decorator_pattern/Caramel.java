package com.software_design.decorator_pattern;

public class Caramel extends IngredientDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with caramel";
    }
    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 5;
    }
}
