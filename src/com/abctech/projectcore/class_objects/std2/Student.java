package com.abctech.projectcore.class_objects.std2;

public class Student {
    private int roll_number;
    private long phone_number;
    private String address;
    private String name;

    public Student(int roll_number, long phone_number, String address,String name) {
        this.roll_number = roll_number;
        this.phone_number = phone_number;
        this.address = address;
        this.name=name;
    }

    public void printStudent() {
        System.out.println("Name: " + name + ", Roll Number: " + roll_number + ", Phone Number: " + phone_number + ", Address: " + address);
    }


}
