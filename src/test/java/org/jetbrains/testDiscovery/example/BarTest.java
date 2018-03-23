package org.jetbrains.testDiscovery.example;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BarTest {
    @Test
    public void testBarGreeting() {
        assertNotNull("Bar should have a greeting", new Bar().getGreeting());
    }

    @Test
    public void testBarSomething() {
        assertNotNull("Bar should have a greeting", new Bar().getSomething());
    }
}
