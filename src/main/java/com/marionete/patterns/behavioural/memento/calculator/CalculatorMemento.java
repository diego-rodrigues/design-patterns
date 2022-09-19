package com.marionete.patterns.behavioural.memento.calculator;

public class CalculatorMemento {

    private final int value;

    public CalculatorMemento(int argument) {
        this.value = argument;
    }

    public int getValue() {
        return value;
    }
}
