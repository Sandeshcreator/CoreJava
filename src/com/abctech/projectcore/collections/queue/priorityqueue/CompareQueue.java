package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class CompareQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numb = new PriorityQueue<>();
        numb.add(25);
        numb.add(5);
        numb.add(50);
        numb.add(20);

        PriorityQueue<Integer> numb1 = new PriorityQueue<>();
        numb1.add(25);
        numb1.add(5);
        numb1.add(50);
        numb1.add(20);

        System.out.println(numb);
        System.out.println(numb1);

        System.out.println(numb.equals(numb1));
        System.out.println(numb.containsAll(numb1));

    }
}
