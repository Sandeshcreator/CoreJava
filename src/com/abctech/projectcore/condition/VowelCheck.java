package com.abctech.projectcore.condition;

public class VowelCheck {
    public static void main(String[] args) {
        String vowel = "aeiou";
        String consonants = " b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y , z";
        String userInput = "e";

        if (vowel.contains(userInput)) {
            System.out.println("its vowel");

        } else {
            System.out.println("its consonants");

        }


    }
}
