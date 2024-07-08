package com.abctech.projectcore.class_objects.mathmatics;

public class Complex {
    private int num1, num2;

    public Complex(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int difference() {
        return num1 - num2;
    }

    public int product() {
        return num1 * num2;
    }
}
