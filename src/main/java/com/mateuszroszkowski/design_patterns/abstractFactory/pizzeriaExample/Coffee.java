package com.mateuszroszkowski.design_patterns.abstractFactory.pizzeriaExample;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
    String name;
    List<String> ingredients = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
