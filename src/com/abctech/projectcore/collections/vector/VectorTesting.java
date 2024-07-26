package com.abctech.projectcore.collections.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 1000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("time taken :" + (end - start) + " ms");

        //normal comparision
        List<Integer> vectorList = new Vector<>();
        start = System.currentTimeMillis();
        for (int i = 0; i <= size; i++) {
            vectorList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("time taken :" + (end - start) + " ms");


        //thread comparision ArrayList
        List<Integer> arrayListt = Collections.synchronizedList( new ArrayList<>());

        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <size; i++) {
                arrayListt.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arrayListt.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();

        System.out.println("time taken :" + (end - start) + " ms"  + arrayListt.size());

        //thread comparision Vector

        List<Integer> vectorListt = new Vector<>();

        start = System.currentTimeMillis();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i <size; i++) {
                vectorListt.add(i);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                vectorListt.add(i);
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        end = System.currentTimeMillis();
        System.out.println("time taken :" + (end - start) + " ms" + vectorListt.size());

    }
}
