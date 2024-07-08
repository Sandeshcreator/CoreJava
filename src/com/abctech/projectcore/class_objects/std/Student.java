package com.abctech.projectcore.class_objects.std;

public class Student {
    int roll_no;
    String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public void printStudent() {
        System.out.println("Roll No: " + roll_no + ", Name: " + name);
    }


}
