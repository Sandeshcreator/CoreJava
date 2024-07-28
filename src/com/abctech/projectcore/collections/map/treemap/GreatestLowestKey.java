package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class GreatestLowestKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(5, "5");
        treeMap.put(4, "Four");

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
    }
}
