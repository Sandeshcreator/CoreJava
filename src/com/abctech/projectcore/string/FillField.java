package com.abctech.projectcore.string;

import java.util.Scanner;

public class FillField {
    /**
     * fill field
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //String letter = "Dear <|name|> , hello>";

        // System.out.println(letter.replace("<|name|>",input));

        System.out.format("%s This is a java and be carefull to touch it", input);

    }
}
