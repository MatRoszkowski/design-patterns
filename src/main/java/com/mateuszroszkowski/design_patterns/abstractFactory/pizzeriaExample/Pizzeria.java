package com.mateuszroszkowski.design_patterns.abstractFactory.pizzeriaExample;


public abstract class Pizzeria {

    public abstract Pizza createPizza();
    public abstract Pasta createPasta();
    public abstract Coffee createCoffee();

    public void bake() {
    }

    public void cut() {
    }

    public void pack() {
    }
}
