package com.abctech.projectcore.collections.map.treemap;

import java.util.TreeMap;

public class UpperLower {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap= new TreeMap<>();

        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(4,4);
        treeMap.put(7,4);
        treeMap.put(8,8);
        treeMap.put(9,9);
        treeMap.put(10,10+1);

        System.out.println(treeMap.headMap(7)); // carry no 7 only less
        System.out.println(treeMap.tailMap(8));  // carry 8 also

    }
}
