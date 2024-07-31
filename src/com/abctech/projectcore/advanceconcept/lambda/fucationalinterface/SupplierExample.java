package com.abctech.projectcore.advanceconcept.lambda.fucationalinterface;


@FunctionalInterface
interface Supplier<T> {
    T get();
}

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello supplier";
        System.out.println(supplier.get());

    }
}
