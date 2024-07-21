package com.abctech.projectcore.thread;


class Good  extends Thread{

    public void run() {
        int i = 1;
        while (i < 100) {

            System.out.println("i m good morning");
            i++;
        }
    }
}
class Welcome  extends Thread{

    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("i m Welcome");
            i++;
        }
    }
}

public class GoodMorning {
    public static void main(String[] args) {
        Good good= new Good();
        good.setPriority(Thread.MAX_PRIORITY);

        Welcome welcome= new Welcome();
        welcome.setPriority(Thread.MIN_PRIORITY);

//        welcome.start();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        good.start();

        System.out.println("Good thread priority: " + good.getPriority());
        System.out.println("Welcome thread priority: " + welcome.getPriority());
    }
}
