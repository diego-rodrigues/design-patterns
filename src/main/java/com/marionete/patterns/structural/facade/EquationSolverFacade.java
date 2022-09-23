package com.marionete.patterns.structural.facade;

public class EquationSolverFacade {

    public static double[] solveFunction(double... args) {
        switch (identifyEquation(args)) {
            // depending on the number of arguments, call a different function solver.
            default : {
                System.out.println("I only know how to solve equations with two or three arguments.");
                return new double[0];
            }
        }
    }

    private static int identifyEquation(double... args) {
        return args.length;
    }
}
