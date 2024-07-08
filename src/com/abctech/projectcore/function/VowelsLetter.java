package com.abctech.projectcore.function;


import java.util.Scanner;

public class VowelsLetter {
    /**
     * 22. Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false.
     * In main() method accept a string from the user and count the number of vowels in that string.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelsLetter vowelsLettervo= new VowelsLetter();
         System.out.print("Enter your word: ");
        String words = scanner.nextLine().toLowerCase();
        int vowelsCounts=0;
        for (int i = 0; i <words.length()-1 ; i++) {
            char ch = words.charAt(i);
            if (vowelsLettervo.isVowel(ch)) {
                vowelsCounts++;
            }
            }
        System.out.println("Number of vowels in the string: " + vowelsCounts);


    }


    public boolean isVowel(char word){
        return word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u';

    }




}
