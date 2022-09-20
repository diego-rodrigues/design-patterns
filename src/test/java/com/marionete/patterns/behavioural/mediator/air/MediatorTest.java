package com.marionete.patterns.behavioural.mediator.air;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MediatorTest {

    static TowerControl towerControl;
    static List<Plane> planes;

    @BeforeEach
    void init() {
        towerControl = new TowerControl(2);

        planes = new ArrayList<>();
        planes.add(new Plane("A1", towerControl));
        planes.add(new Plane("B5", towerControl));
        planes.add(new Plane("C9", towerControl));

        planes.forEach(towerControl::register);
    }

    @Test
    void testTracksAvailable() {
        Assertions.assertTrue(planes.get(0).requestTakeOff());
        Assertions.assertTrue(planes.get(1).requestTakeOff());
    }

    @Test
    void testNoMoreTracksAvailable() {
        planes.get(0).requestTakeOff();
        planes.get(1).requestTakeOff();

        Assertions.assertFalse(planes.get(2).requestTakeOff());
    }

    @Test
    void testUnknownPlane() {
        Assertions.assertFalse(new Plane("D", towerControl).requestTakeOff());
    }
}
