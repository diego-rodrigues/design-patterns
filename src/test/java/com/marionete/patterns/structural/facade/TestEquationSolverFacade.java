package com.marionete.patterns.structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEquationSolverFacade {

    @Test
    void testLinearFunction() {
        double a = 2;
        double b = 2;

        double[] result = EquationSolverFacade.solveFunction(new double[]{a, b});
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(-1, result[0]);
    }

    @Test
    void testQuadraticFunction() {
        double a = 2;
        double b = 2;
        double c = -24;
        double[] result = EquationSolverFacade.solveFunction(new double[] {a,b,c});
        Assertions.assertEquals(2, result.length);
        Assertions.assertEquals(3, result[0]);
        Assertions.assertEquals(-4, result[1]);
    }
}
