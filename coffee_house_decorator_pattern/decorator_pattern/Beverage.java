package com.software_design.decorator_pattern;

public abstract class Beverage {

    String beverageName = "";

    String getBeverageName() {
        return beverageName;
    }
    abstract int getBeveragePrice();
}
