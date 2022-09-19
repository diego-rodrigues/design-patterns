package com.marionete.patterns.structural.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlTest {

    @Test
    void testAdvancedRemoteControl() {
        TV tv = new TV();
        AdvancedRemoteControl remote = new AdvancedRemoteControl(tv);

        Assertions.assertFalse(tv.isEnabled());
        remote.togglePower();
        Assertions.assertTrue(tv.isEnabled());

        Assertions.assertEquals(30, tv.getVolume());
        remote.volumeUp();
        remote.volumeUp();
        Assertions.assertEquals(50, tv.getVolume());

        remote.mute();
        Assertions.assertEquals(0, tv.getVolume());

        Assertions.assertEquals(5, tv.getChannel());
        remote.channelDown();
        remote.channelDown();
        remote.channelDown();
        Assertions.assertEquals(2, tv.getChannel());
    }
}
