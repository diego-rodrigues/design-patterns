package com.marionete.patterns.behavioural.strategy;


/**
 * It lets you define different algorithms in separate classes, making them interchangeable
 */
public class Application {

    public static void main(String[] args) {
        Context calculator = new Context();
        String operator = "+";
        int a, b;
        a = 10;
        b = 5;

        switch (operator) {
            case "+": {
                calculator.setStrategy(new AddStrategy());
                break;
            }
            case "-": {
                calculator.setStrategy(new SubtractStrategy());
                break;
            }
            case "*": {
                calculator.setStrategy(new MultiplyStrategy());
                break;
            }
            case "/": {
                calculator.setStrategy(new DivideStrategy());
                break;
            }
        }

        int result = calculator.runStrategy(a, b);
        System.out.println("Result is: " + result);
    }
}
