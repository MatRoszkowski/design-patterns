package com.mateuszroszkowski.design_patterns.factoryMethod.pizzeriaExample;

public class NewYorkPizzeria extends Pizzeria {
    @Override
    public Pizza createPizza() {
        return new NewYorkStylePizza();
    }
}
