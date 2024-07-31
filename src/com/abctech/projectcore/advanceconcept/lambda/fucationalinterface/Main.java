package com.abctech.projectcore.advanceconcept.lambda.fucationalinterface;

public class Main {
    public static void main(String[] args) {
        Predict<String> stringPredict = s -> s.length() > 8;

        System.out.println(stringPredict.test("hello"));
        System.out.println(stringPredict.test("hello tesat"));
    }
}
