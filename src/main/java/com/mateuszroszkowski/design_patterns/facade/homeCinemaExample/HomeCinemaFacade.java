package com.mateuszroszkowski.design_patterns.facade.homeCinemaExample;

public class HomeCinemaFacade {
    Audio audio;
    Light light;
    PopcornMachine popcornMachine;
    Projector projector;
    Screen screen;

    public HomeCinemaFacade(Audio audio, Light light, PopcornMachine popcornMachine, Projector projector, Screen screen) {
        this.audio = audio;
        this.light = light;
        this.popcornMachine = popcornMachine;
        this.projector = projector;
        this.screen = screen;
    }

    public void startWatchingFilm(String filmName, int lightIntensity, int volume) {
        this.popcornMachine.turnOn();
        this.popcornMachine.preparePopcorn();
        this.screen.turnOn();
        this.screen.down();
        this.projector.turnOn();
        this.projector.setFilm(filmName);
        this.light.turnOn();
        this.light.setLightIntensity(lightIntensity);
        this.audio.turnOn();
        this.audio.setVolume(volume);
    }

    public void stopWatchingFilm() {
        this.popcornMachine.turnOff();
        this.screen.up();
        this.screen.turnOff();
        this.projector.turnOff();
        this.light.turnOff();
        this.audio.turnOff();
    }
}
