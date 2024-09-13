package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        App app = new App();
        assertEquals(-1, app.add(2, -3));
    }

    @Test
    public void testAddBothNegativeNumbers() {
        App app = new App();
        assertEquals(-5, app.add(-2, -3));
    }
}
