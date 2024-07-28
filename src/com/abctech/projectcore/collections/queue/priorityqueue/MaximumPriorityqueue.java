package com.abctech.projectcore.collections.queue.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumPriorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("\nOriginal Priority Queue: " + pq1);

        Integer val = null;
        while ((val = pq1.poll()) != null)
            System.out.print(val + "  ");
    }


}
