package com.mateuszroszkowski.design_patterns.facade.homeCinemaExample;

public class Projector {
    public void turnOn() {
        System.out.println("The projector is turning on");
    }

    public void turnOff() {
        System.out.println("The projector is turning off");
    }
    public void setFilm(String filmName){
        System.out.println("Projected film: " + filmName);
    }
}
