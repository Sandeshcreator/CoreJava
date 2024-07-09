package com.abctech.projectcore.inheritance.first;

public class Program {
    /**
     * Create a class with a method that prints "This is parent class"
     * and its subclass with another method that prints "This is child class".
     * Now, create an object for each of the class and call
     * --------X----------------
     * 1 - method of parent class by object of parent class
     * 2 - method of child class by object of child class
     * 3 - method of parent class by object of child class
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
