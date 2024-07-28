package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class SearchKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        System.out.println(treeMap.containsKey(9));
        System.out.println(treeMap.get(5));

        int keyToSearch = 3;

        // Search for the key
        if (treeMap.containsKey(keyToSearch)) {
            String value = treeMap.get(keyToSearch);
            System.out.println("Key " + keyToSearch + " is found with value: " + value);
        } else {
            System.out.println("Key " + keyToSearch + " is not found in the TreeMap.");
        }


    }
}
