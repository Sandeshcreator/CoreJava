package com.abctech.projectcore.abstractdemo.clsslearn;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length*breadth;
    }

    @Override
    double calculatePerimeter() {
        return 2*(length+breadth);
    }

}
