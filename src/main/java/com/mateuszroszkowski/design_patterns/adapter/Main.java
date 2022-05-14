package com.mateuszroszkowski.design_patterns.adapter;

import com.mateuszroszkowski.design_patterns.adapter.duckTurkeyExample.*;
import com.mateuszroszkowski.design_patterns.adapter.holePegExample.RoundHole;
import com.mateuszroszkowski.design_patterns.adapter.holePegExample.RoundPeg;
import com.mateuszroszkowski.design_patterns.adapter.holePegExample.SquarePeg;
import com.mateuszroszkowski.design_patterns.adapter.holePegExample.SquarePegAdapter;

public class Main {
    public static void main(String[] args) {
//        duckTurkeyExample();
        holePegExample();
    }

    private static void duckTurkeyExample(){
        Duck duck = new ConcreteDuck();
        Turkey turkey = new ConcreteTurkey();

        Duck turkeyAdapter = new TurkeyToDuckAdapter(turkey);

        System.out.println("Turkey: ");
        turkey.gurgle();
        turkey.fly();

        System.out.println("Duck: ");
        duck.quack();
        duck.fly();

        System.out.println("Turkey adopted to duck: ");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

    private static void holePegExample(){
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}
