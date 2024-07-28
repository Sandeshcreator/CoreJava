package com.abctech.projectcore.collections.map.hashmap;

import java.util.HashMap;

public class CopyOf {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        HashMap<String, Integer> hashCopyMap = (HashMap<String, Integer>) map.clone();

        System.out.println(map);
        System.out.println(hashCopyMap);

        map.replace("Apple", 55);
        map.putIfAbsent("helli", 6);
        map.putIfAbsent("Apple", 58);

        System.out.println(map);
        System.out.println(hashCopyMap);


    }
}
