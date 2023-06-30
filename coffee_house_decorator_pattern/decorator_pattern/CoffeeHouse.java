package com.software_design.decorator_pattern;

public class CoffeeHouse {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

        System.out.println("Beverage after decorating with milk");
        beverage = new Milk(beverage);

        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

        System.out.println("Beverage after decorating with caramel");

        beverage = new Caramel(beverage);

        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

        System.out.println("Beverage after decorating with double caramel");

        beverage = new Caramel(beverage);

        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeveragePrice());

    }
}
