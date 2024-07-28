package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class CopyTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        TreeMap<Integer, String> map = new TreeMap<>();

        map.putAll(treeMap);

        System.out.println(map);


    }
}
