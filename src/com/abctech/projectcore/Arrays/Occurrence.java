package com.abctech.projectcore.Arrays;

public class Occurrence {
    /**
     *  Find the occurrence of an integer in the array.
     *
     */
    public static void main(String[] args) {

        int[] arr = {22,55,66,22,80,55,22,22};
        int num =55;
        int count =0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
                count++;
            }
        }
        System.out.println(count);

    }
}
