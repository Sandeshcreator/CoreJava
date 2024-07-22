package com.abctech.projectcore.calculator;

public class CalculatorFunction implements Calculator {


    @Override
    public double add(double numb1, double numb2) {
        return numb1 + numb2;
    }

    @Override
    public double sub(double numb1, double numb2) {
        return numb1 - numb2;
    }

    @Override
    public double multiply(double numb1, double numb2) {
        return numb1 * numb2;
    }

    @Override
    public double div(double numb1, double numb2) throws ArithmeticException {
        if (numb2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numb1 / numb2;
    }
}
