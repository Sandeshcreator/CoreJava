package com.abctech.projectcore.collections.map.hashmap;

import java.util.HashMap;

public class ContainsKeyValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue(2));

    }
}
