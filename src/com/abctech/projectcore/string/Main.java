package com.abctech.projectcore.string;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Length
        System.out.println("Length: " + str.length());

        // Character Access
        System.out.println("Character at index 1: " + str.charAt(1));

        // Comparison
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));

        // Searching
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        // Substring
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // Case Conversion
        System.out.println("To Lower Case: " + str.toLowerCase());
        System.out.println("To Upper Case: " + str.toUpperCase());

        // Trimming
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // Replacing
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // Splitting
        String[] parts = str.split(", ");
        System.out.println("Split: " + String.join(" and ", parts));

        // Joining
        String joined = String.join(", ", parts);
        System.out.println("Joined: " + joined);

        // Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted: " + formatted);

        // Conversion
        int num = 42;
        System.out.println("String value of num: " + String.valueOf(num));
    }
}

