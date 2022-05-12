package com.mateuszroszkowski.design_patterns.abstractFactory.pizzeriaExample;

public class NewYorkPizzeria extends Pizzeria{
    @Override
    public Pizza createPizza() {
        return new NewYorkStylePizza();
    }

    @Override
    public Pasta createPasta() {
        return new AmericanPasta();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
