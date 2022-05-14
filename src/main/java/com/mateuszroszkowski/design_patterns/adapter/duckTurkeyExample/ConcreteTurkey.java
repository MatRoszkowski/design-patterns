package com.mateuszroszkowski.design_patterns.adapter.duckTurkeyExample;

public class ConcreteTurkey implements Turkey{
    @Override
    public void gurgle() {
        System.out.println("Gurgle, Gurgle");
    }

    @Override
    public void fly() {
        System.out.println("I cant fly :(");
    }
}
