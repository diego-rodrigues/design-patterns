package com.marionete.patterns.behavioural.mediator;

import com.marionete.patterns.behavioural.mediator.air.Plane;
import com.marionete.patterns.behavioural.mediator.air.TowerControl;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages communications among complex classes through a Mediator class.
 */
public class Application {

    public static void main(String[] args) {
        TowerControl towerControl = new TowerControl(2);

        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane("A1", towerControl));
        planes.add(new Plane("B5", towerControl));
        planes.add(new Plane("C9", towerControl));

        // register planes
        planes.forEach(towerControl::register);

        // register events
        System.out.println(towerControl.printTracks());
        planes.get(0).requestTakeOff();
        System.out.println(planes.get(0).getStatus());
        System.out.println(towerControl.printTracks());

        planes.get(1).requestTakeOff();
        System.out.println(planes.get(1).getStatus());
        System.out.println(towerControl.printTracks());

        planes.get(0).done();
        System.out.println(planes.get(0).getStatus());
        System.out.println(towerControl.printTracks());

        planes.get(2).requestTakeOff();
        System.out.println(planes.get(2).getStatus());
        System.out.println(towerControl.printTracks());

        planes.get(0).requestLand();
        System.out.println(planes.get(0).getStatus());
        System.out.println(towerControl.printTracks());

        planes.get(2).done();
        System.out.println(planes.get(2).getStatus());
        System.out.println(towerControl.printTracks());

        planes.get(0).requestLand();
        System.out.println(planes.get(0).getStatus());
        System.out.println(towerControl.printTracks());
    }

}
