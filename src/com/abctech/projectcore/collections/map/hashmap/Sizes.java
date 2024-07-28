package com.abctech.projectcore.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Sizes {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("sandesh", 555);
        map.put("san", 522);
        map.put("sandy", 5);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
    }
}
