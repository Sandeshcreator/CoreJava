package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class GreatestFloorEntryExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(9, "9");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(5, "five");
        treeMap.put(4, "Four");

        int key = 6;

        System.out.println("Key-value mapping associated with the greatest key less than or equal to " + key + ": " + treeMap.floorEntry(key));
        System.out.println(treeMap.ceilingEntry(key));
    }
}
