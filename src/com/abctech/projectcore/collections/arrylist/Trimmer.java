package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;

public class Trimmer {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        colors.trimToSize();
    }
}
