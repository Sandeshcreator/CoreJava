package com.abctech.projectcore.collections.set.hashhset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("san");
        set.add("desh");
        set.add("sandy");

        ArrayList<String> stringArrayList = new ArrayList<>(set);
        System.out.println(stringArrayList);

    }
}
