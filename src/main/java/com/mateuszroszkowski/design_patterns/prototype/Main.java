package com.mateuszroszkowski.design_patterns.prototype;

import com.mateuszroszkowski.design_patterns.prototype.basicExample.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        basicExample();

    }

    private static void basicExample() {
        List<String> list1 = Arrays.asList("string1", "string2", "string3");
        Prototype prototype = new Prototype("string1", 420, list1);

        Prototype newPrototype = (Prototype) prototype.clone();

        if (prototype.getName().equals(newPrototype.getName())) {
            System.out.println("Objects have the same name");
        }
        if (prototype.getNumber() == newPrototype.getNumber()) {
            System.out.println("Objects have the same number");
        }
        if (prototype.getStringList().equals(newPrototype.getStringList())) {
            System.out.println("Objects have the same list");
        }
        if (!(prototype == newPrototype)) {
            System.out.println("But they are not the same object");
        }
    }
}
