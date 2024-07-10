package com.abctech.projectcore.constructor.copy;

public class Main {
    public static void main(String[] args) {
        CopyClss person1 = new CopyClss("John", 25);

        CopyClss person2 = new CopyClss(person1);

        person1.display();
        person2.display();
    }
}