package com.abctech.projectcore.Arrays;

public class CountingSum {
    /**
     * Count pairs with given sum
     * Example:
     * Input:
     * N = 4, K = 6
     * arr[] = {1, 5, 7, 1}
     * Output: 2
     * Explanation:
     * arr[0] + arr[1] = 1 + 5 = 6
     * and arr[1] + arr[3] = 5 + 1 = 6.
     */
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        int count = 0;
        int K = 6;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 6) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}