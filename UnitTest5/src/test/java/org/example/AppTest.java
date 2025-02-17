package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testGreeting() {
        App app = new App();
        assertEquals("Hello, JUnit!", app.getGreeting());
    }
}
