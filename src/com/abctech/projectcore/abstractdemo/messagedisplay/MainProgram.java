package com.abctech.projectcore.abstractdemo.messagedisplay;

public class MainProgram {
    public static void main(String[] args) {
        FirstSub firstSub = new FirstSub();
        firstSub.message();

        SecondSub secondSub = new SecondSub();
        secondSub.message();
    }
}
