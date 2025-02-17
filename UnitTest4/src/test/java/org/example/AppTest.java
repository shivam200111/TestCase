package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMain() {
        // Just calling main() to ensure it runs without exceptions
        App.main(new String[]{});
    }

    @Test
    public void testGetGreeting() {
        App app = new App();
        assertEquals("Hello, JUnit!", app.getGreeting());
    }
}
