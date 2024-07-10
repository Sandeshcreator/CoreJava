package com.abctech.projectcore.constructor.copy;

public class CopyClss {
    protected String name;
    protected int age;

    public CopyClss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CopyClss(CopyClss copyClss) {
        this.name = copyClss.name;
        this.age = copyClss.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
