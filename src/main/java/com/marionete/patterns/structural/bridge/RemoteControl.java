package com.marionete.patterns.structural.bridge;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device d) {
        device = d;
    }

    public void togglePower() {
        if (device.isEnabled())
            device.disable();
        else device.enable();
    }

    public void volumeDown() {
        if (device.isEnabled())
            device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        if (device.isEnabled())
            device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        if (device.isEnabled())
            device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        if (device.isEnabled())
            device.setChannel(device.getChannel() + 1);
    }

}
