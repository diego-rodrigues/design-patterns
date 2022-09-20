package com.marionete.patterns.behavioural.memento;

import com.marionete.patterns.behavioural.memento.calculator.CalculatorCaretaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    static CalculatorCaretaker calculator;

    @BeforeEach
    void init() {
        calculator = new CalculatorCaretaker();
    }

    @Test
    void testSumOperation() {
        calculator.registerOperation("+", 3);
        calculator.registerOperation("+", 5);
        calculator.registerOperation("+", 7);
        Assertions.assertEquals("Current value is: 15", calculator.toString());
    }

    @Test
    void testMinusOperation() {
        calculator.registerOperation("-", 3);
        calculator.registerOperation("-", -5);
        Assertions.assertEquals("Current value is: 2", calculator.toString());
    }

    @Test
    void testMultiplyOperation() {
        calculator.registerOperation("+", 1);
        calculator.registerOperation("*", 3);
        calculator.registerOperation("*", 5);
        Assertions.assertEquals("Current value is: 15", calculator.toString());
    }

    @Test
    void testDivideOperation() {
        calculator.registerOperation("+", 3);
        calculator.registerOperation("/", 3);
        Assertions.assertEquals("Current value is: 1", calculator.toString());
    }

    @Test
    void testUndoOperation() {
        calculator.registerOperation("+", 3);
        calculator.registerOperation("/", 3);
        calculator.undo();
        Assertions.assertEquals("Current value is: 3", calculator.toString());
    }

    @Test
    void testPowerOperation() {
        calculator.registerOperation("+", 5);
        calculator.registerOperation("^", 3);
        Assertions.assertEquals("Current value is: 125", calculator.toString());
        calculator.undo();
        Assertions.assertEquals("Current value is: 5", calculator.toString());
    }


}
