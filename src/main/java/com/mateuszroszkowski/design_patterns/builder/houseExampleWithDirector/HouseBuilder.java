package com.mateuszroszkowski.design_patterns.builder.houseExampleWithDirector;

public interface HouseBuilder {
    void setName(String name);

    void buildWalls(String wallsMaterial);

    void buildFoundation(String foundation);

    void setNumberOfDoors(int numberOfDoors);

    void setNumberOfWindows(int numberOfWindows);
}
