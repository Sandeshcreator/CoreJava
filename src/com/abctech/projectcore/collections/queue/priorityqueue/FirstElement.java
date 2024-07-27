package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class FirstElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> numb1 = new PriorityQueue<>();
        numb1.add(25);
        numb1.add(5);
        numb1.add(50);
        numb1.add(20);

        System.out.println(numb1);
        System.out.println(numb1.peek());

//        remove first
        System.out.println(numb1.poll());
        System.out.println(numb1);

    }
}
