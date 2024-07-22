package com.abctech.projectcore.calculator;

public interface Calculator {
    public double add(double numb1 ,double numb2);
    public double sub(double numb1 ,double numb2);
    public double multiply(double numb1 ,double numb2);
     double div(double numb1, double numb2) throws ArithmeticException;

}
