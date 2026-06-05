package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Sample unit test class for PR validation pipeline.
 */
public class SampleTest {

    /**
     * Test that addition works correctly.
     */
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    /**
     * Test that subtraction works correctly.
     */
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    /**
     * Test that multiplication works correctly.
     */
    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 7);
        assertEquals(42, result);
    }

    /**
     * Test that division works correctly.
     */
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(20, 4);
        assertEquals(5, result);
    }
}
