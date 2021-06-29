package com.artezio.JUnit5Maven.service;

public class CalculatorService {
    public double sum(int a, int b) {
        return a + b;
    }

    public double minus(int a, int b) {
        return a - b;
    }

    public double multiple(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
