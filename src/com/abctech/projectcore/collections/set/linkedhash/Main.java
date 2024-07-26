package com.abctech.projectcore.collections.set.linkedhash;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // Attempt to add a duplicate element
        linkedHashSet.add("Apple");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if an element is present
        System.out.println("Contains 'Banana': " + linkedHashSet.contains("Banana"));

        // Remove an element
        linkedHashSet.remove("Date");

        // Print the updated LinkedHashSet
        System.out.println("Updated LinkedHashSet: " + linkedHashSet);

        // Iterate over the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
