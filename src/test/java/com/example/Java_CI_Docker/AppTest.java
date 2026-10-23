
package com.example.Java_CI_Docker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    App calculator = new App();

    @Test
    public void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testAdditionWithNegativeNumber() {
        assertEquals(5, calculator.add(10, -5));
    }
}
