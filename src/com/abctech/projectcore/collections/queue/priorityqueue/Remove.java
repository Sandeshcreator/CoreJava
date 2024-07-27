package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class Remove {
    public static void main(String[] args) {
        PriorityQueue<Integer> numb = new PriorityQueue<>();
        numb.add(25);
        numb.add(5);
        numb.add(50);
        numb.add(20);

        System.out.println(numb);

        numb.removeAll(numb);
        numb.clear();

        System.out.println(numb);

    }
}
