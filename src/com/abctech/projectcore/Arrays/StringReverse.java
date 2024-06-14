package com.abctech.projectcore.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String name= "sos";
        String nme = "";
        for (int i = name.length()-1; i >=0 ; i--) {
           nme+= name.charAt(i);
        }
        System.out.println(nme.equalsIgnoreCase(name)?"palindrome":"not");

    }
}
