package com.artezio.JUnit5Maven.service;

public class Math {
    CalculatorService calculatorService;

    public double pow(int a) {
        calculatorService = new CalculatorService();
        return calculatorService.multiple(a, a);
    }
}
