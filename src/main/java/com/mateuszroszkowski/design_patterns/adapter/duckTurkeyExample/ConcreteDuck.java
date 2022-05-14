package com.mateuszroszkowski.design_patterns.adapter.duckTurkeyExample;

public class ConcreteDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack, Quack");
    }

    @Override
    public void fly() {
        System.out.println("Hurray, Im flying!");
    }
}
