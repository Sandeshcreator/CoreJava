package com.abctech.projectcore.Arrays;

public class MoveNegativePostive {
   //ARRAY
    public static void main(String[] args) {
        int[] arr = {22,-55,-66,22,80,55,-22,22};
        int[] positive={};
        int[] negative={};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                positive= new int[]{arr[i]};

            }else{
                negative= new int[]{arr[i]};
            }
        }
        System.out.println(positive +","+negative);
    }
}
