package com.mateuszroszkowski.design_patterns.abstractFactory.furnitureExample;

public class VictorianFurnitureFactory extends FurnitureFactory{
    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
