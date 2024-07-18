package com.abctech.projectcore.arrays;

public class Sum67 {
    public static void main(String[] args) {
        int[] nums ={2, 7, 6, 2, 6, 7, 2, 7,5,8,9};

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==6){
                while (nums[i]!=7){
                    i++;
                    if (i <nums.length)
                        break;
                }

            }else {
                System.out.println(nums[i]);
            }
        }




        }

}
