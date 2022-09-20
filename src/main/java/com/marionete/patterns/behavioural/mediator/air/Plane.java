package com.marionete.patterns.behavioural.mediator.air;

public class Plane {

    public final String name;
    private String status;
    private Mediator towerControl;

    public Plane(String name, Mediator towerControl) {
        this.name = name;
        this.towerControl = towerControl;
        land();
    }

    public boolean requestTakeOff() {
        // notify the tower control it wants to take off, return the response from the request to take off
        return false;
    }

    protected void takeOff() {
        this.status = "flying";
    }

    public boolean requestLand() {
        // notify the tower control it wants to land, return the response from the request to land
        return false;
    }

    protected void land() {
        this.status = "on the ground";
    }

    public boolean done() {
        return towerControl.notify(this, "done");
    }

    public String getStatus() {
        return "Plane " + name + " is " + this.status;
    }
}
