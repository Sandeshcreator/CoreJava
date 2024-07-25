package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;

public class PrntCollection {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("yellow");
        colors.add("green");
        colors.add("black");
        colors.add("white");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("-----------------------");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
