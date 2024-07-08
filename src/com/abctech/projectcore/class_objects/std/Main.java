package com.abctech.projectcore.class_objects.std;

public class Main {
    /**
     * Create a class named 'Student' with String variable 'name'
     * and integer variable 'roll_no'. Assign the value of roll_no as '2'
     * and that of name as "John" by creating an object of the class Student.
     */
    public static void main(String[] args) {
        Student student = new Student(2, "John");


        student.printStudent();

    }
}
