package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class SearchValue {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        System.out.println(treeMap.containsKey(9));
        System.out.println(treeMap.get(5));

        String valueToSearch = "Three";

        // Search for the value
        if (treeMap.containsValue(valueToSearch)) {
            System.out.println("Value \"" + valueToSearch + "\" is found in the TreeMap.");
        } else {
            System.out.println("Value \"" + valueToSearch + "\" is not found in the TreeMap.");
        }
    }
}
