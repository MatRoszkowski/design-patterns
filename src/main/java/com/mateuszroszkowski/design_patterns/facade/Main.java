package com.mateuszroszkowski.design_patterns.facade;

import com.mateuszroszkowski.design_patterns.facade.homeCinemaExample.*;

public class Main {
    public static void main(String[] args) {
        homeCinemaExample();
    }

    private static void homeCinemaExample() {
        HomeCinemaFacade homeCinemaFacade = new HomeCinemaFacade(
                new Audio(),
                new Light(),
                new PopcornMachine(),
                new Projector(),
                new Screen());

        homeCinemaFacade.startWatchingFilm("American Psycho", 5, 5);
        System.out.println("--------------");
        homeCinemaFacade.stopWatchingFilm();
    }
}
