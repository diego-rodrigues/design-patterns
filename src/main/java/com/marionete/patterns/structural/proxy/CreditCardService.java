package com.marionete.patterns.structural.proxy;

public class CreditCardService implements PaymentService {

    private int credit;
    private BankService bankAccountProxy;

    public CreditCardService(int initialCredit, BankService bankAccount) {
        if (initialCredit > bankAccount.getBalance())
            initialCredit = bankAccount.getBalance();

        this.credit = initialCredit;
        this.bankAccountProxy = bankAccount;
    }

    @Override
    public boolean pay(int amount) {
        if (credit >= amount) {
            credit -= amount;
            return bankAccountProxy.pay(amount);
        } else {
            return false;
        }
    }
}
