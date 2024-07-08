package com.abctech.projectcore.loop;

public class PalindromeString {
    /**
     * 18. Write a program to check whether the number or string is palindrome or not.
     */
    public static void main(String[] args) {

        String name= "mom";
        String reverseResult = "";
        char res = 0;

        for (int i = name.length()-1; i >=0 ; i--) {
            reverseResult+=name.charAt(i);
        }
        System.out.println(reverseResult.equals(name)?"palindrome":"not");

    }
}
