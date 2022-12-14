package com.marionete.patterns.structural.adapter;

/**
 * Allows incompatible interfaces to work together.
 */
public class Application {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(7));

        if (roundHole.fits(adapter.getRadius()))
            System.out.println("The square peg fits in the hole.");
        else
            System.out.println("The square peg does not fit in the hole.");

        adapter = new SquarePegAdapter(new SquarePeg(10));
        if (roundHole.fits(adapter.getRadius()))
            System.out.println("The square peg fits in the hole.");
        else
            System.out.println("The square peg does not fit in the hole.");

    }

}
