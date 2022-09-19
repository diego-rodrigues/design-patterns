package com.marionete.patterns.structural.facade;

class QuadraticFunction {

    // solves ax2 + bx + c = 0
    public static double[] solve(double a, double b, double c) {
        double delta = Delta.getValue(a, b, c);

        if (Delta.numberOfSolutions() == 0) return new double[0];
        else {
            double solution1 = (-b + Math.sqrt(delta))/(2 * a);
            double solution2 = (-b - Math.sqrt(delta))/(2 * a);

            if (solution1 == solution2) return new double[] {solution1};
            else return new double[] {solution1, solution2};
        }
    }
}