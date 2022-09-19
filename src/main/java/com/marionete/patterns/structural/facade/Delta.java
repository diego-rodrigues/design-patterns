package com.marionete.patterns.structural.facade;

public class Delta {

    private static int solutions = 0;

    public static int numberOfSolutions() {
        return solutions;
    }

    public static double getValue(double a, double b, double c) {
        double value = Math.pow(b, 2) - 4 * a * c;
        if (value == 0) solutions = 1;
        else if (value > 0) solutions = 2;
        else solutions = 0;
        return value;
    }
}
