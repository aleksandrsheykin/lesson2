package com.company;

public class Main {

    public static void main(String[] args) {
        ArrList<String> arr = new ArrList<>(10);
        arr.add("asdf");
        System.out.println(arr.toString());
        //System.out.println(arr[0]);
        arr.writeList();
    }
}
