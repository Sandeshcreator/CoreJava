package com.abctech.projectcore.Function;

import java.util.Scanner;

public class VowelChecks {
    /**
     *23. Write a method that takes input string from the user and return true if it contains vowels otherwise false.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelChecks vowelChecks= new VowelChecks();
        System.out.println("Enter a word");
        String words=scanner.nextLine().toLowerCase();

        if (vowelChecks.containVowel(words)){
            System.out.println("It contains vowel");
        }else {
            System.out.println("It no contains vowel");
        }
    }

    public boolean containVowel(String word){


        for (int i = 0; i <word.length()-1 ; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }





}
