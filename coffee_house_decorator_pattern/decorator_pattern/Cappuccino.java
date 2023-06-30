package com.software_design.decorator_pattern;

public class Cappuccino extends Beverage {

    public Cappuccino() {
        beverageName = "Cappuccino Coffee";
    }
    @Override
    int getBeveragePrice() {
        return 12;
    }
}
