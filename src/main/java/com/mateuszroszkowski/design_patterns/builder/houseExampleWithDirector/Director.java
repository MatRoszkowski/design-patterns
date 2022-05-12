package com.mateuszroszkowski.design_patterns.builder.houseExampleWithDirector;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void changeBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructWoodenHouse(){
        houseBuilder.setName("Wooden house");
        houseBuilder.buildFoundation("Light foundation for wooden house");
        houseBuilder.buildWalls("Light walls made out of wood");
        houseBuilder.setNumberOfDoors(3);
        houseBuilder.setNumberOfWindows(15);
    }

    public void constructBrickHouse(){
        houseBuilder.setName("Brick house");
        houseBuilder.buildFoundation("Strong, concrete foundation for wooden house");
        houseBuilder.buildWalls("Heavy walls made out of bricks");
        houseBuilder.setNumberOfDoors(1);
        houseBuilder.setNumberOfWindows(10);
    }
}
