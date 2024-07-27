package com.abctech.projectcore.collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();
        deque.offer('q');
        deque.offer('u');
        deque.offer('e');
        deque.offer('r');
        deque.offer('y');
        deque.addFirst('a');

        System.out.println("The before deque is : " + deque);

        Character val = deque.pollFirst();
        System.out.println("The first character is given as : " + val);
        System.out.println("The remaining deque is : " + deque);
    }
}
