package com.marionete.patterns.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquarePegAdapterTest {

    static RoundHole roundHole = new RoundHole(5);

    @Test
    void testSomethingFitsInRoundHole() {
        Assertions.assertTrue(roundHole.fits(3));
    }

    @Test
    void testSomethingDoesNotFitInRoundHole() {
        Assertions.assertFalse(roundHole.fits(10));
    }

    @Test
    void testSquarePegFitsInRoundHole() {
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(7));

        Assertions.assertTrue(roundHole.fits(adapter.getRadius()));
    }

    @Test
    void testSquarePegDoesNotFitInRoundHole() {
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(10));

        Assertions.assertFalse(roundHole.fits(adapter.getRadius()));
    }
}
