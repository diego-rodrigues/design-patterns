package com.marionete.patterns.behavioural.state;

import com.marionete.patterns.behavioural.state.states.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StateTest {

    static Document d;

    @BeforeEach
    void init() {
        d = new Document(0);
    }

    @Test
    void testLifecycleDocument() {
        Assertions.assertEquals(">> Document 0 is in draft state.", d.status());

        d.review(true);
        Assertions.assertEquals(">> Document 0 is in draft state.", d.status());

        d.publish();
        Assertions.assertEquals(">> Document 0 is in review state.", d.status());

        d.review(false);
        Assertions.assertEquals(">> Document 0 is in draft state.", d.status());

        d.publish();
        Assertions.assertEquals(">> Document 0 is in review state.", d.status());

        d.review(true);
        Assertions.assertEquals(">> Document 0 is in approved state.", d.status());

        d.publish();
        Assertions.assertEquals(">> Document 0 is in published state.", d.status());
    }
}
