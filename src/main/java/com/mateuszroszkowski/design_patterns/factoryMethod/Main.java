package com.mateuszroszkowski.design_patterns.factoryMethod;

import com.mateuszroszkowski.design_patterns.factoryMethod.pizzeriaExample.NeapolitanPizzeria;
import com.mateuszroszkowski.design_patterns.factoryMethod.pizzeriaExample.NewYorkPizzeria;
import com.mateuszroszkowski.design_patterns.factoryMethod.pizzeriaExample.Pizza;
import com.mateuszroszkowski.design_patterns.factoryMethod.pizzeriaExample.Pizzeria;

public class Main {
    private static String typeOfPizzeria = "NewYork";
    private static Pizzeria pizzeria;

    public static void main(String[] args) {
        pizzeriaExample();

    }

    private static void pizzeriaExample() {
        configure();

        Pizza pizza = pizzeria.createPizza();
        System.out.println(pizza.getName());
    }


    private static void configure() {
        if (typeOfPizzeria.equals("NewYork")) {
            pizzeria = new NewYorkPizzeria();
        } else if (typeOfPizzeria.equals("Neapolitan")) {
            pizzeria = new NeapolitanPizzeria();
        }
    }
}
