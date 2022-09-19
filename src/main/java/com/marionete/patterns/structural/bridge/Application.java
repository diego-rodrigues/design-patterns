package com.marionete.patterns.structural.bridge;

/**
 * Bridge pattern allows creating connections between complex classes through the use of interfaces.
 */
public class Application {

    public static void main(String[] args) {
        TV tv = new TV();
        AdvancedRemoteControl remote = new AdvancedRemoteControl(tv);

        System.out.println("Is TV turned on? " + tv.isEnabled());

        remote.togglePower();
        System.out.println("Is TV turned on? " + tv.isEnabled());

        System.out.println("Volume is: " + tv.getVolume());
        remote.volumeUp();
        remote.volumeUp();
        System.out.println("Volume after is: " + tv.getVolume());

        remote.mute();
        System.out.println("Volume after mute is: " + tv.getVolume());

        System.out.println("Channel is: " + tv.getChannel());
        remote.channelDown();
        remote.channelDown();
        remote.channelDown();
        System.out.println("Channel is: " + tv.getChannel());
    }
}
