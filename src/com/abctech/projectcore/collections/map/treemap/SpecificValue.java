package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class SpecificValue {
    public static void main(String[] args) {
        int keyToFind = 2;

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        String value = treeMap.get(keyToFind);

        System.out.println("Value associated with key " + keyToFind + ": " + value);
    }
}
