package com.abctech.projectcore.collections.map.hashmap;

import java.util.HashMap;

public class MapToMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        HashMap<String, Integer> hashMap = new HashMap<>(map);
        System.out.println(hashMap);

    }
}
