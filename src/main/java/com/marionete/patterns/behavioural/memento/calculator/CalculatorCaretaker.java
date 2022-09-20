package com.marionete.patterns.behavioural.memento.calculator;

import java.util.Stack;

public class CalculatorCaretaker {

    Stack<CalculatorMemento> history = new Stack<>();
    OriginatorCalculator calculator = new OriginatorCalculator();

    public void registerOperation(String operation, int argument) {
        CalculatorMemento memento = calculator.save();
        if (calculator.calculate(operation, argument)) {
            history.push(memento);
            System.out.println(calculator.toString());
        }
    }

    public void undo() {
        if (!history.empty()) {
            calculator.restore(history.pop());
            System.out.println("After undo operation: " + calculator.toString());
        }
    }

    @Override
    public String toString() {
        return calculator.toString();
    }


}
