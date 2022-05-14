package com.mateuszroszkowski.design_patterns.facade.homeCinemaExample;

public class Screen {
    public void turnOn() {
        System.out.println("The screen is turning on");
    }

    public void turnOff() {
        System.out.println("The screen is turning off");
    }

    public void down() {
        System.out.println("The screen is going down");
    }

    public void up() {
        System.out.println("The screen is going up");
    }

}
