package com.abctech.projectcore.collections.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GetKeyValueEntrySet {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
        //    System.out.println(iterator.next());

            System.out.println("keys");
            System.out.println(mapEntry.getKey());

            System.out.println("values");
            System.out.println(mapEntry.getValue());
        }
    }
}
