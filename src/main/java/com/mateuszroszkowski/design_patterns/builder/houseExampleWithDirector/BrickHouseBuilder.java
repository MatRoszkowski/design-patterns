package com.mateuszroszkowski.design_patterns.builder.houseExampleWithDirector;

public class BrickHouseBuilder implements HouseBuilder {
    private BrickHouse house = new BrickHouse();

    @Override
    public void setName(String name) {
        this.house.setName(name);
    }

    @Override
    public void buildWalls(String wallsMaterial) {
        this.house.setWallsMaterial(wallsMaterial);
    }

    @Override
    public void buildFoundation(String foundation) {
        this.house.setFoundation(foundation);
    }

    @Override
    public void setNumberOfDoors(int numberOfDoors) {
        this.house.setNumberOfDoors(numberOfDoors);
    }

    @Override
    public void setNumberOfWindows(int numberOfWindows) {
        this.house.setNumberOfWindows(numberOfWindows);
    }

    public BrickHouse getResult() {
        return this.house;
    }
}
