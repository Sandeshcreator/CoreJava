package com.abctech.projectcore.Arrays;

public class SortingArray {
    /**
     * Wap to sort the given array.
     */
    public static void main(String[] args) {
        int[] arr = {22, 2, 6, 7, 80};
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int sortArr : arr) {
            System.out.print(sortArr + " ");
        }

    }
}
