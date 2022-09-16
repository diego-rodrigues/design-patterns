package com.marionete.patterns.structural.adapter;

public class Application {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(7, 1));

        if (roundHole.fits(adapter.getRadius()))
            System.out.println("The square peg fits in the hole.");
        else
            System.out.println("The square peg does not fit in the hole.");

        adapter = new SquarePegAdapter(new SquarePeg(10, 1));
        if (roundHole.fits(adapter.getRadius()))
            System.out.println("The square peg fits in the hole.");
        else
            System.out.println("The square peg does not fit in the hole.");

    }

}
