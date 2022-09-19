package com.marionete.patterns.structural.proxy;

public class BankService implements PaymentService{

    private int balance;

    public BankService(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean pay(int amount) {
        if (balance > amount) {
            System.out.println("Bank accepted payment.");
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Bank rejected payment.");
            return false;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
