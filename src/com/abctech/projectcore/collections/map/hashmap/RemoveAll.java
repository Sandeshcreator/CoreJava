package com.abctech.projectcore.collections.map.hashmap;

import java.util.Collections;
import java.util.HashMap;

public class RemoveAll {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        map.clear();

        System.out.println(map);
    }
}
