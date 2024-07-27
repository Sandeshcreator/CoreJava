package com.abctech.projectcore.collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(50);
        deque.add(20);
        deque.add(30);
        deque.add(5);

        System.out.println(deque);

        deque.add(5);

        System.out.println(deque);

        deque.addFirst(10);
        deque.addLast(100);

        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println("Initial deque: " + deque);

        System.out.println("Polling first element: " + deque.pollFirst());
        System.out.println("Deque after polling first element:");
        System.out.println(deque);

        System.out.println("Polling last element: " + deque.pollLast());
        System.out.println("Deque after polling last element:");
        System.out.println(deque);


    }
}
