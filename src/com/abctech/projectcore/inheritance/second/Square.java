package com.abctech.projectcore.inheritance.second;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void displayArea() {
        System.out.println("Area of a Square: " + (length * length));
    }

    @Override
    public void displayPerimeter() {
        System.out.println("Perimeter of a Square: " + (4 * length));
    }
}
