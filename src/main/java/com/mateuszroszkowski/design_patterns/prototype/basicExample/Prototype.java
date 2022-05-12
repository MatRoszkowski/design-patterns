package com.mateuszroszkowski.design_patterns.prototype.basicExample;

import java.util.List;

public class Prototype {
    String name;
    int number;
    List<String> stringList;

    public Prototype(String name, int number, List<String> stringList) {
        this.name = name;
        this.number = number;
        this.stringList = stringList;
    }

    public Prototype(Prototype prototype) {
        this.name = prototype.getName();
        this.number = prototype.getNumber();
        this.stringList = prototype.getStringList();
    }

    @Override
    public Object clone() {
        return new Prototype(this);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<String> getStringList() {
        return stringList;
    }
}
