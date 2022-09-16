package com.marionete.patterns.structural.facade;

public class EquationSolverFacade {

    public static double[] solveFunction(double... args) {
        switch (identifyEquation(args)) {
            case 2: {
                return LinearFunction.solve(args[0], args[1]);
            }
            case 3: {
                return QuadraticFunction.solve(args[0], args[1], args[2]);
            }
            default : {
                System.out.println("Not supported.");
                return new double[0];
            }
        }
    }

    private static int identifyEquation(double... args) {
        return args.length;
    }
}