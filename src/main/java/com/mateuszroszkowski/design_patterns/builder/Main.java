package com.mateuszroszkowski.design_patterns.builder;

import com.mateuszroszkowski.design_patterns.builder.houseExampleWithDirector.*;

public class Main {
    public static void main(String[] args) {
        houseExampleWithDirector();
    }

    private static void houseExampleWithDirector(){
        WoodenHouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        Director director = new Director(woodenHouseBuilder);
        director.constructWoodenHouse();

        WoodenHouse woodenHouse = woodenHouseBuilder.getResult();

        System.out.println(woodenHouse.getName());
        System.out.println(woodenHouse.getFoundation());
        System.out.println(woodenHouse.getWallsMaterial());
        System.out.println(woodenHouse.getNumberOfDoors());
        System.out.println(woodenHouse.getNumberOfWindows());

        BrickHouseBuilder brickHouseBuilder = new BrickHouseBuilder();
        director.changeBuilder(brickHouseBuilder);
        director.constructBrickHouse();
        BrickHouse brickHouse = brickHouseBuilder.getResult();

        System.out.println(brickHouse.getName());
        System.out.println(brickHouse.getFoundation());
        System.out.println(brickHouse.getWallsMaterial());
        System.out.println(brickHouse.getNumberOfDoors());
        System.out.println(brickHouse.getNumberOfWindows());

    }


}
