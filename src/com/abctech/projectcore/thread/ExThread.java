package com.abctech.projectcore.thread;

class Multithread1 extends Thread {
    @Override
    public void run() {

        int i = 1;
        while (i < 10) {
            System.out.println("i m cooking");
            i++;
        }
    }
}

class Multithread2 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("i m chatting");
            i++;
        }
    }
}

public class ExThread {
    public static void main(String[] args) {
        Multithread1 multithread1 = new Multithread1();
        Multithread2 multithread2 = new Multithread2();
        multithread1.start();
        multithread2.start();

    }
}
