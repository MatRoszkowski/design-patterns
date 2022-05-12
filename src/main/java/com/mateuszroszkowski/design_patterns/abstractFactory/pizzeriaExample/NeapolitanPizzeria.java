package com.mateuszroszkowski.design_patterns.abstractFactory.pizzeriaExample;

public class NeapolitanPizzeria extends Pizzeria {
    @Override
    public Pizza createPizza() {
        return new NeapolitanPizza();
    }

    @Override
    public Pasta createPasta() {
        return new ItalianPasta();
    }

    @Override
    public Coffee createCoffee() {
        return new ItalianCoffee();
    }
}
