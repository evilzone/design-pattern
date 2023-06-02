package com.abstract_factory_pattern;

public class Main {

    public static void main(String[] args) {

        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getAbstractFactory("Premium");
        Car car = abstractFactory.getInstance(5000000);

        System.out.println(car.getTopSpeed());

    }
}
