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
        return towerControl.notify(this, "take-off");
    }

    protected void takeOff() {
        this.status = "flying";
    }

    public boolean requestLand() {
        return towerControl.notify(this, "land");
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
