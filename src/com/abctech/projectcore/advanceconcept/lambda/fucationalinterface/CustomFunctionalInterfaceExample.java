package com.abctech.projectcore.advanceconcept.lambda.fucationalinterface;


@FunctionalInterface
interface MyName{
 void Mymethod(int e);
}

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyName myName=(e)->{
            System.out.println("Sandesh and age is " + e);
        };
        myName.Mymethod(20);
    }
}
