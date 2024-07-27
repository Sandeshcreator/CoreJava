package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ColorsAddPrint {
    public static void main(String[] args) {
        PriorityQueue<String> colours = new PriorityQueue<>();
        colours.add("Red");
        colours.add("yellow");
        colours.add("blue");
        colours.add("yellow");

//        System.out.println(colours);

        Iterator<String> iterator = colours.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
