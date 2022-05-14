package com.mateuszroszkowski.design_patterns.adapter.duckTurkeyExample;

public class TurkeyToDuckAdapter implements Duck{
    Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gurgle();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
