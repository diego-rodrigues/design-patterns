package com.marionete.patterns.behavioural.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    static final Context calculator = new Context();
    static final int a = 10;
    static final int b = 5;

    @Test
    void testAddStrategy() {
        calculator.setStrategy(new AddStrategy());
        Assertions.assertEquals(15, calculator.runStrategy(a, b));
    }

    @Test
    void testSubtractStrategy() {
        calculator.setStrategy(new SubtractStrategy());
        Assertions.assertEquals(5, calculator.runStrategy(a, b));
    }
    @Test
    void testMultiplyStrategy() {
        calculator.setStrategy(new MultiplyStrategy());
        Assertions.assertEquals(50, calculator.runStrategy(a, b));
    }
    @Test
    void testDivideStrategy() {
        calculator.setStrategy(new DivideStrategy());
        Assertions.assertEquals(2, calculator.runStrategy(a, b));
    }
}
