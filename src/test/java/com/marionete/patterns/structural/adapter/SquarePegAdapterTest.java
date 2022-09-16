package com.marionete.patterns.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquarePegAdapterTest {

    @Test
    void testSquarePegFitsInRoundHole() {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(7, 1));

        Assertions.assertTrue(roundHole.fits(adapter.getRadius()));
    }

    @Test
    void testSquarePegDoesNotFitInRoundHole() {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(10, 1));

        Assertions.assertFalse(roundHole.fits(adapter.getRadius()));
    }
}
