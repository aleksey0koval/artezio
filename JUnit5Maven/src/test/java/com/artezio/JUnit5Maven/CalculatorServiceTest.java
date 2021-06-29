package com.artezio.JUnit5Maven;

import com.artezio.JUnit5Maven.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorServiceTest {

    @Test
    void sum() {
        CalculatorService calculator = new CalculatorService();
        double result = calculator.sum(1, 2);
        System.out.println(result);
        if (result != 3) {
            fail();
        }
    }

    @Test
    void minus() {
        CalculatorService calculator = new CalculatorService();
        double result = calculator.minus(5, 2);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    void multiple() {
        CalculatorService calculator = new CalculatorService();
        double result = calculator.multiple(2, 2);
        System.out.println(result);
        assertEquals(4, result);
    }

    @Test
    void divide() {
        CalculatorService calculator = new CalculatorService();
        double result = calculator.divide(2, 2);
        System.out.println(result);
        assertEquals(1, result);
    }

    @Test
    public void divideOnZero() {
        CalculatorService calculator = new CalculatorService();
        double result = calculator.divide(6, 0);
        System.out.println(result);
    }
}