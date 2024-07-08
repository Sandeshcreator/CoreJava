package com.abctech.projectcore.class_objects.std2;

public class Main {
    /**
     * Assign and print the roll number, phone number and address of two students having
     * names "Sam" and "John" respectively by creating two objects of class 'Student'.
     */
    public static void main(String[] args) {
        Student student1 = new Student(101, 1234567890L, "123 Main St", "Sam");
        Student student2 = new Student(102, 9876543210L, "456 Elm St", "John");

         student1.printStudent();
        student2.printStudent();
    }
}
