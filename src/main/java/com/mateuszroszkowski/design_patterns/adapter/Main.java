package com.mateuszroszkowski.design_patterns.adapter;

import com.mateuszroszkowski.design_patterns.adapter.duckTurkeyExample.*;

public class Main {
    public static void main(String[] args) {
        duckTurkeyExample();
    }

    private static void duckTurkeyExample(){
        Duck duck = new ConcreteDuck();
        Turkey turkey = new ConcreteTurkey();

        Duck turkeyAdapter = new TurkeyToDuckAdapter(turkey);

        System.out.println("Turkey: ");
        turkey.gurgle();
        turkey.fly();

        System.out.println("Duck: ");
        duck.quack();
        duck.fly();

        System.out.println("Turkey adopted to duck: ");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
