package com.abctech.projectcore.inheritance.second;

public class Rectangle {
    protected int length, breadth;

    public Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public void displayArea() {
        System.out.println("Area of a Rectangle:" + (length * breadth));
    }

    public void displayPerimeter() {
        System.out.println("Perimeter of a Rectangle:" + (2 * (length + breadth)));
    }

}
