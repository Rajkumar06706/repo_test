package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for Application class.
 */
public class ApplicationTest {

    /**
     * Test getMessage method.
     */
    @Test
    public void testGetMessage() {
        String message = Application.getMessage();
        assertNotNull("Message should not be null", message);
        assertTrue("Message should contain CI/CD", message.contains("CI/CD"));
    }

    /**
     * Test performCalculation method.
     */
    @Test
    public void testPerformCalculation() {
        int result = Application.performCalculation(10, 5);
        assertEquals("10 + 5 should equal 15", 15, result);
    }

    /**
     * Test performCalculation with negative numbers.
     */
    @Test
    public void testPerformCalculationNegative() {
        int result = Application.performCalculation(-5, 3);
        assertEquals("-5 + 3 should equal -2", -2, result);
    }

    /**
     * Test performCalculation with zeros.
     */
    @Test
    public void testPerformCalculationZero() {
        int result = Application.performCalculation(0, 0);
        assertEquals("0 + 0 should equal 0", 0, result);
    }
}
