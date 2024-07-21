package com.abctech.projectcore.arrays;

public class Hash12 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 5, 2};
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        System.out.println("got 1 in" + i + "got 2 in" + j);
                    }
                }


            }
        }


    }

}
