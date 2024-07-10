package com.abctech.projectcore.constructor.school;

public class Program {
    /**
     * Write a program to print the names of students by creating a Student class.
     * If no name is passed while creating an object of Student class, then the name should
     * be "Unknown", otherwise the name should be equal to the String value passed while
     * creating object of Student class.
     */

    public static void main(String[] args) {
        Student student = new Student("sandesh", 25);
        student.display();

        Student student1 = new Student(27);
        student1.display();

    }
}
