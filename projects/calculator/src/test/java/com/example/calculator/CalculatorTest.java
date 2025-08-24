package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test void testMultiplication() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test void testDivision() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test void testIsEvenTrue() {
        assertTrue(calc.isEven(4));
    }

    @Test void testIsEvenFalse() {
        assertFalse(calc.isEven(5));
    }

    @Test void testIsPrimeTrue() {
        assertTrue(calc.isPrime(7));
    }

    @Test void testIsPrimeFalse() {
        assertFalse(calc.isPrime(9));
    }

    @Test void testIsPrimeEdgeCase() {
        assertFalse(calc.isPrime(1));
    }
}
