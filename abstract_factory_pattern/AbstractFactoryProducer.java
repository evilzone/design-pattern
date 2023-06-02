package com.abstract_factory_pattern;

public class AbstractFactoryProducer {

    public AbstractFactory getAbstractFactory(String value) {
        if(value.equals("Economic")) {
            return new EconomicCarFactory();
        } else if(value.equals("Luxury") || value.equals("Premium")) {
            return new LuxuryCarFactory();
        }
        return null;
    }
}
