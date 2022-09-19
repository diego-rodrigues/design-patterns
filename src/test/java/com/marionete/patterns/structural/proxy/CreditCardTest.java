package com.marionete.patterns.structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardTest {

    @Test
    void testPaymentAccepted() {
        BankService account = new BankService(400);
        CreditCardService card = new CreditCardService(100, account);

        Assertions.assertTrue(card.pay(50));
        Assertions.assertEquals(350, account.getBalance());
    }

    @Test
    void testPaymentRejected() {
        BankService account = new BankService(400);
        CreditCardService card = new CreditCardService(100, account);

        Assertions.assertFalse(card.pay(150));
        Assertions.assertEquals(400, account.getBalance());
    }
}
