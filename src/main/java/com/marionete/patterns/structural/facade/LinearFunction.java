package com.marionete.patterns.structural.facade;

public class LinearFunction {

    // solves ax + b = 0
    public static double[] solve(double a, double b) {
        return new double[] {-b / a};
    }
}
