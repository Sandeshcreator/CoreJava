package com.abctech.projectcore.recursion;

public class SumNatural {
    public static void main(String[] args) {
        int number=5;
        SumNatural sumNatural= new SumNatural();
        System.out.println(sumNatural.naturalNum(number));

    }
//    public int naturalNum(int input) {
//        int i=1;
//        int sum=0;
//        if (i==input){
//            sum+=i;
//            return sum;
//        }
//        sum+=i;
//        return sum;
//
//    }





    public int naturalNum(int input) {
        if (input == 1) {  // base case
            return 1;
        }
        return input + naturalNum(input - 1);  // recursive step
    }
}
