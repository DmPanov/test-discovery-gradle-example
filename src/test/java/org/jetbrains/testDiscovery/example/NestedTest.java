package org.jetbrains.testDiscovery.example;


import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(Enclosed.class)
public class NestedTest {
    public static class OneNestedFooTest {
        @Test
        public void testNestedFooGreeting() {
            assertNotNull("Foo should have a greeting", new Foo().getGreeting());
        }
    }

    public static class AnotherNestedFooTest {
        @Test
        public void testAnotherNestedFooGreeting() {
            assertNotNull("Foo should have a greeting", new Foo().getGreeting());
        }
    }

    public static class NestedBarTest {
        @Test
        public void testNestedBarGreeting() throws InterruptedException {
            assertNotNull("Bar should have a greeting", new Bar().getGreeting());
        }
    }
}
