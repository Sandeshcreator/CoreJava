package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class ToArrays {
    public static void main(String[] args) {
        PriorityQueue<String> colours = new PriorityQueue<>();
        colours.add("Red");
        colours.add("yellow");
        colours.add("blue");
        colours.add("yellow");

        String[] arr = colours.toArray(new String[colours.size()]);

        PriorityQueue<Integer> numb = new PriorityQueue<>();
        numb.add(25);
        numb.add(5);
        numb.add(50);
        numb.add(20);

        Integer[] numbs = numb.toArray(new Integer[0]);

        System.out.println("Array elements:");

        for (Integer num : numbs) {
            System.out.println(num);
        }
    }
}
