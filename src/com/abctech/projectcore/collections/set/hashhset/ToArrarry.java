package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;
import java.util.Set;

public class ToArrarry {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("san");
        set.add("desh");
        set.add("sandy");

        String[] strings = set.toArray(new String[0]);


    }
}
