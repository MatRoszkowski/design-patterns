package com.mateuszroszkowski.design_patterns.abstractFactory.furnitureExample;


public abstract class FurnitureFactory {
    public abstract Table createTable();

    public abstract Sofa createSofa();

    public abstract Chair createChair();
}
