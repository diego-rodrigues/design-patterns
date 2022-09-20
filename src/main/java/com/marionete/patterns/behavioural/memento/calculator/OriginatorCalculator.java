package com.marionete.patterns.behavioural.memento.calculator;

import java.util.ArrayList;
import java.util.List;

public class OriginatorCalculator {

    private int value = 0;
    private List<String> supportedOperations;

    public OriginatorCalculator() {
        supportedOperations = new ArrayList<>();
        supportedOperations.add("+");
        supportedOperations.add("-");
        supportedOperations.add("/");
        supportedOperations.add("*");
    }

    public boolean calculate(String operation, int argument) {
        if (supportedOperations.contains(operation))
            System.out.println("> " + value + " " + operation + " " + argument + ";");

        switch (operation) {
            case "+" : {
                value += argument;
                return true;
            }
            case "-" : {
                value -= argument;
                return true;
            }
            case "*" : {
                value *= argument;
                return true;
            }
            case "/" : {
                value /= argument;
                return true;
            }
            default: return false;
        }
    }

    public CalculatorMemento save() {
        return new CalculatorMemento(this.value);
    }

    public void restore(CalculatorMemento memento) {
        this.value = memento.getValue();
    }

    @Override
    public String toString() {
        return "Current value is: " + value;
    }
}
