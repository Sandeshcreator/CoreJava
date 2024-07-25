package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;

public class Clear {
    //Write a Java program to empty an array list.
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        colors.remove(2);
        colors.remove("Purple");

        System.out.println(colors);

        colors.clear();

        System.out.println(colors);
    }
}
