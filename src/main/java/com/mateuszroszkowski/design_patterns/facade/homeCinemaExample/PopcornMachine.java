package com.mateuszroszkowski.design_patterns.facade.homeCinemaExample;

public class PopcornMachine {
    public void turnOn() {
        System.out.println("The popcorn machine is turning on");
    }

    public void turnOff() {
        System.out.println("The popcorn machine is turning off");
    }
    public void preparePopcorn(){
        System.out.println("Preparing popcorn");
    }
}
