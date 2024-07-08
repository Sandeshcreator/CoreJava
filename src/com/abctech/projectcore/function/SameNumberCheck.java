package com.abctech.projectcore.function;

public class SameNumberCheck {
    /**
     * 17. Create a function that returns true when both the parameters are equal else return false. isSameNum(4, 8) ➞ false
     */
    public static void main(String[] args) {
        System.out.println(isSameNum(4, 8));
        System.out.println(isSameNum(7, 7));
        System.out.println(isSameNum(0, -1));
    }
    public static boolean  isSameNum(int numbOne, int numbTwo){
        return numbOne==numbTwo;
    }
}
