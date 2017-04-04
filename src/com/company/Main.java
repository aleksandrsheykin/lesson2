package com.company;

public class Main {

    public static void main(String[] args) {
        ArrList<Double> arr = new ArrList<>(10);
        arr.add(12.0);
        System.out.println(arr.toString());
    }
}
