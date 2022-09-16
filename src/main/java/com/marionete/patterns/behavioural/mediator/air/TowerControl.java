package com.marionete.patterns.behavioural.mediator.air;

import java.util.HashMap;
import java.util.Map;

public class TowerControl implements Mediator {

    private Map<String, Plane> planes;
    private String flightTrack[];


    public TowerControl(int tracks) {
        planes = new HashMap<>();
        flightTrack = new String[tracks];
    }

    @Override
    public boolean notify(Plane sender, String event) {
        if (!planes.containsKey(sender.name)) return false;

        switch (event) {
            case "take-off" : {
                System.out.print("Plane " + sender.name + " requested to take off - ");
                int track = findEmptyTrack();
                if (track != -1) {
                    flightTrack[track] = sender.name;
                    sender.takeOff();
                    System.out.println("accepted.");
                    return true;
                }
                break;
            }
            case "land" : {
                System.out.print("Plane " + sender.name + " requested to land - ");
                int track = findEmptyTrack();
                if (track != -1) {
                    flightTrack[track] = sender.name;
                    sender.land();
                    System.out.println("accepted.");
                    return true;
                }
                break;
            }
            case "done" : {
                System.out.println("Plane " + sender.name + " has finished operation.");
                int track = getIndexOfTrack(sender);
                if (track != -1) {
                    flightTrack[track] = "";
                    return true;
                }
            }
        }

        System.out.println("denied.");
        return false;
    }

    @Override
    public void register(Plane plane) {
        planes.put(plane.name, plane);
    }

    private int findEmptyTrack() {
        for (int i = 0; i < flightTrack.length; i++)
            if (null == flightTrack[i] || flightTrack[i].compareTo("") == 0)
                return i;
        return -1;
    }

    private int getIndexOfTrack(Plane sender) {
        for (int i = 0; i < flightTrack.length; i++)
            if (flightTrack[i].compareTo(sender.name) == 0)
                return i;
        return -1;
    }

    public String printTracks() {
        StringBuilder tracksStatus = new StringBuilder();
        for (int i = 0; i < flightTrack.length; i++) {
            tracksStatus.append("Track " + i + ": ");
            if (null == flightTrack[i] || flightTrack[i].compareTo("") == 0)
                tracksStatus.append("empty\n");
            else
                tracksStatus.append(flightTrack[i] + "\n");
        }
        return tracksStatus.toString();
    }
}
