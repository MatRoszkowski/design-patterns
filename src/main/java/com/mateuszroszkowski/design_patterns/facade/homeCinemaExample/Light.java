package com.mateuszroszkowski.design_patterns.facade.homeCinemaExample;

public class Light {
    public void turnOn() {
        System.out.println("The light is turning on");
    }

    public void turnOff() {
        System.out.println("The light is turning off");
    }

    public void setLightIntensity(int lightIntensity) {
        System.out.println("Light intensity set to: " + lightIntensity);
    }
}
