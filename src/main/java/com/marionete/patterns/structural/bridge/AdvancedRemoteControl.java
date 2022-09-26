package com.marionete.patterns.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device d) {
        super(d);
    }

    public void mute() {
        // sets volume to 0
        device.setVolume(0);
    }
}
