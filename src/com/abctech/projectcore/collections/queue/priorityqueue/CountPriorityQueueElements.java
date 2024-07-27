package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class CountPriorityQueueElements {
    public static void main(String[] args) {
        PriorityQueue<Integer> numb = new PriorityQueue<>();
        numb.add(25);
        numb.add(5);
        numb.add(50);
        numb.add(20);

        System.out.println(numb);
        System.out.println(numb.size());
    }
}
