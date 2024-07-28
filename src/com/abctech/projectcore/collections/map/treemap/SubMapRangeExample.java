package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class SubMapRangeExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(9, "9");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(5, "5");
        treeMap.put(4, "Four");

        int startKey = 2;
        int endKey = 5;

        System.out.println("Portion of the map from key " + startKey + " (inclusive) to key " + endKey + " (exclusive): " + treeMap.subMap(startKey, endKey));
    }
}
