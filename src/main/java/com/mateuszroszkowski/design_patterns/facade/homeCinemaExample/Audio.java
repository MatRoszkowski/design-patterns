package com.mateuszroszkowski.design_patterns.facade.homeCinemaExample;

public class Audio {
    public void turnOn() {
        System.out.println("The audio is turning on");
    }

    public void turnOff() {
        System.out.println("The audio is turning off");
    }

    public void setVolume(int volume) {
        System.out.println("Audio volume set to: " + volume);
    }
}
