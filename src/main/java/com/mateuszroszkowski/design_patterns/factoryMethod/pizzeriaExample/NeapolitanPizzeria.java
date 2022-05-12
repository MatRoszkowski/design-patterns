package com.mateuszroszkowski.design_patterns.factoryMethod.pizzeriaExample;

public class NeapolitanPizzeria extends Pizzeria {
    @Override
    public Pizza createPizza() {
        return new NeapolitanPizza();
    }
}
