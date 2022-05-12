package com.mateuszroszkowski.design_patterns.builder.houseExampleWithDirector;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WoodenHouse {
    private String name;
    private String wallsMaterial;
    private String foundation;
    private int numberOfDoors;
    private int numberOfWindows;
}
