package com.abctech.projectcore.function;


import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int randomInt=   random.nextInt(20);
        System.out.println(randomInt);
    }
}
