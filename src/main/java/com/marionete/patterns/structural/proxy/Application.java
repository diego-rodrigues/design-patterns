package com.marionete.patterns.structural.proxy;

public class Application {

    public static void main(String[] args) {
        CreditCardService card = new CreditCardService(100, new BankService(400));

        System.out.println("Trying to pay 50...");
        System.out.println(card.pay(50));

        System.out.println("Trying to pay 60...");
        System.out.println(card.pay(60));
    }
}
