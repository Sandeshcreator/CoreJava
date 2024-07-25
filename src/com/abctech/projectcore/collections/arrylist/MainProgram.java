package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        // Create and initialize the first ArrayList with Integer elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);    // Add 20 to the ArrayList
        arrayList.add(22);    // Add 22 to the ArrayList
        arrayList.add(200);   // Add 200 to the ArrayList
        arrayList.add(80);    // Add 80 to the ArrayList
        arrayList.add(90);    // Add 90 to the ArrayList
        arrayList.add(90);    // Add another 90 to the ArrayList (ArrayLists allow duplicate values)

        // Create and initialize the second ArrayList with Integer elements
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);   // Add 10 to the second ArrayList
        arrayList1.add(110);  // Add 110 to the second ArrayList
        arrayList1.add(150);  // Add 150 to the second ArrayList
        arrayList1.add(120);  // Add 120 to the second ArrayList

        // Add all elements from arrayList1 to arrayList
        arrayList.addAll(arrayList1);

        // Clear the contents of arrayList (commented out, so it's not executed)
        // arrayList.clear();

        // Check if arrayList contains the element 120
        System.out.println(arrayList.contains(120)); // Output: true

        // Find and print the index of the first occurrence of element 120
        System.out.println(arrayList.indexOf(120)); // Output: 8 (index of 120 in the combined ArrayList)

        // Check if the arrayList is empty
        System.out.println(arrayList.isEmpty()); // Output: false (arrayList is not empty)

        // Print the number of elements in arrayList
        System.out.println(arrayList.size()); // Output: 10 (size of arrayList after adding elements from arrayList1)

        // Remove element at index 2 (commented out, so it's not executed)
        // arrayList.remove(2);

        // Remove all elements that are in arrayList1 from arrayList (commented out, so it's not executed)
        // arrayList.removeAll(arrayList1);

        // Set the element at index 0 to 5 (replaces 20 with 5)
        arrayList.set(0, 5);

        // Remove elements based on a condition (commented out, so it's not executed)
        // arrayList.removeIf(a -> a > 20); // Example of removing elements greater than 20 (lambda expression)

        System.out.println("----------");

        // Print a sublist from index 1 (inclusive) to index 3 (exclusive)
        System.out.println(arrayList.subList(1, 3)); // Output: [22, 200]

        // Iterate through arrayList using an enhanced for loop
        for (int a : arrayList) {
            System.out.println(a); // Print each element in the ArrayList
        }
    }
}
