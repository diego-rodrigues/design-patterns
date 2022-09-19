package com.marionete.patterns.behavioural.memento;

import com.marionete.patterns.behavioural.memento.calculator.CalculatorCaretaker;

public class Application {

    public static void main(String[] args) {
        CalculatorCaretaker calculator = new CalculatorCaretaker();

        calculator.registerOperation("+", 5);
        calculator.registerOperation("-", 3);
        calculator.undo();
        calculator.registerOperation("*", 2);
        calculator.registerOperation("/", 4);
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
    }
}
