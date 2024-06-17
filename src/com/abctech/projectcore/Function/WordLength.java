package com.abctech.projectcore.Function;

import java.util.Scanner;

public class WordLength {
    /**
     * 16. Write a java program to count all the words of a string . Example : I want to be a software engineer. Output : 7
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WordLength wordLength= new WordLength();

        System.out.println("Enter a number ");
        String word = scanner.nextLine();

        System.out.println(wordLength.length(word));
    }


    public int length(String word) {
        int count = 1;
        if (word == null || word.isEmpty()) {
            return 0;
        } else {
            for (int i = 1; i < word.length() - 1; i++) {
                if (word.charAt(i) == ' ' && word.charAt(i + 1) != ' ') {
                    count++;
                }
            }
            return count;
        }
    }

}
