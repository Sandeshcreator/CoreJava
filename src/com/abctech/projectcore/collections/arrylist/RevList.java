package com.abctech.projectcore.collections.arrylist;

import java.util.*;

public class RevList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        /**
         * Write a Java program to retrieve an element (at a specified index)
         * from a given array list.
         */
        System.out.println(colors.get(2));

        /**
         * Write a Java program to remove the third element from an array list.
         */
        System.out.println(colors.remove(2));

        /**
         * Write a Java program to search an element in an array list.
         */
        System.out.println(colors.indexOf("Yellow"));


        Collections.reverse(colors);

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
