package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class AddElementsToAnotherPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> colours = new PriorityQueue<>();
        colours.add("Red");
        colours.add("yellow");
        colours.add("blue");
        colours.add("yellow");

        PriorityQueue<String> colour = new PriorityQueue<>(colours);
        colour.addAll(colours);

        System.out.println(colour);

    }
}
