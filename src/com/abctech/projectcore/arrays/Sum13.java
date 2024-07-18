package com.abctech.projectcore.arrays;

public class Sum13 {
    public static void main(String[] args) {
        int[] nums={13, 1, 2, 13, 2, 1, 13};

        int sum=0;
        for(int i =0; i<nums.length; i+=2){
            if(nums[i]==13){
                i=i+1;
            }else{
                System.out.println(nums[i]);
            }


        }
    }
}
