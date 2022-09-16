package com.marionete.patterns.structural.facade;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = -24;

        System.out.println("Linear function:");
        double[] result = EquationSolverFacade.solveFunction(new double[] {a,b});
        Arrays.stream(result).forEach(System.out::println);

        System.out.println("Quadratic function:");
        result = EquationSolverFacade.solveFunction(new double[] {a,b,c});
        Arrays.stream(result).forEach(System.out::println);
    }
}
