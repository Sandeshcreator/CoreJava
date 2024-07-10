package com.abctech.projectcore.constructor.school;

public class Student {
    protected String name;
    protected int roll_numb;

    public Student(String name, int roll_numb) {
        this.name = name;
        this.roll_numb = roll_numb;
    }

    public Student(int roll_numb) {
        this.name = "Unknown";
        this.roll_numb = roll_numb;
    }

    public void display() {
        System.out.println("Student NAME : " + name);
        System.out.println("Student Roll Numb : " + roll_numb);

    }
}
