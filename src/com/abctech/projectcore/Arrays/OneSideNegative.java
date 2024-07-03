package com.abctech.projectcore.Arrays;

public class OneSideNegative {
    /**
     * *  Move all the negative elements to one side of the array.
     */

    public static void main(String[] args) {
        int[] arr = {-22, 2, -6, 7, -80};
        int temp = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }


        for (int sortArr : arr) {
            System.out.print(sortArr + " ");
        }

    }

}