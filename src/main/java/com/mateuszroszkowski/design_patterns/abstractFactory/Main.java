package com.mateuszroszkowski.design_patterns.abstractFactory;

import com.mateuszroszkowski.design_patterns.abstractFactory.furnitureExample.*;
import com.mateuszroszkowski.design_patterns.abstractFactory.pizzeriaExample.*;


public class Main {
    private static String typeOfPizzeria = "NewYork";
    private static Pizzeria pizzeria;

    public static void main(String[] args) {
//        pizzeriaExample();
        furnitureExample();

    }

    private static void furnitureExample() {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Table modernTable = modernFurnitureFactory.createTable();
        Sofa modernSofa = modernFurnitureFactory.createSofa();
        Chair modernChair = modernFurnitureFactory.createChair();

        System.out.println(modernTable.getName());
        System.out.println(modernSofa.getName());
        System.out.println(modernChair.getName());

        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Table victorianTable = victorianFurnitureFactory.createTable();
        Sofa victorianSofa = victorianFurnitureFactory.createSofa();
        Chair victorianChair = victorianFurnitureFactory.createChair();

        System.out.println(victorianTable.getName());
        System.out.println(victorianSofa.getName());
        System.out.println(victorianChair.getName());
    }

    private static void pizzeriaExample() {
        configure();

        Pizza pizza = pizzeria.createPizza();
        Pasta pasta = pizzeria.createPasta();
        Coffee coffee = pizzeria.createCoffee();
        ;
        System.out.println(pizza.getName());
        System.out.println(pasta.getName());
        System.out.println(coffee.getName());
    }


    private static void configure() {
        if (typeOfPizzeria.equals("NewYork")) {
            pizzeria = new NewYorkPizzeria();
        } else if (typeOfPizzeria.equals("Neapolitan")) {
            pizzeria = new NeapolitanPizzeria();
        }
    }
}
