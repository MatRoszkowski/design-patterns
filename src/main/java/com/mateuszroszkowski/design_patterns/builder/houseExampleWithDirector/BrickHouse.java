package com.mateuszroszkowski.design_patterns.builder.houseExampleWithDirector;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BrickHouse {
    private String name;
    private String wallsMaterial;
    private String foundation;
    private int numberOfDoors;
    private int numberOfWindows;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWallsMaterial() {
        return wallsMaterial;
    }

    public void setWallsMaterial(String wallsMaterial) {
        this.wallsMaterial = wallsMaterial;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
