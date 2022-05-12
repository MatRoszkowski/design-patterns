package com.mateuszroszkowski.design_patterns.abstractFactory.furnitureExample;

public class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
