package com.abctech.projectcore.collections.comparable;

public class School implements  Comparable<School>{
    private int rollNumber;
    private int phoneNumber;
    private String name;

    @Override
    public int compareTo(School o) {
        return Integer.compare(this.rollNumber, o.rollNumber);

        //for string name
        //return this.name.compareTo(o.name);

    }

    public School(int rollNumber, int phoneNumber, String name) {
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "rollNumber=" + rollNumber +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }




}
