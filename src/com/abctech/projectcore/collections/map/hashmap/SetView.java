package com.abctech.projectcore.collections.map.hashmap;

import java.util.HashMap;

public class SetView {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        System.out.println("map view " + hash_map);
        System.out.println("set view " + hash_map.entrySet());
        System.out.println(hash_map.get(10));




    }
}
