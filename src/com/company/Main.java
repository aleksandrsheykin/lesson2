package com.company;

public class Main {

    public static void main(String[] args) {
        ArrList<String> arr = new ArrList<>(10);
        arr.add("aaa");
        arr.add("bbb", 1);
        arr.add("ccc", 5);
        arr.add("ddd", 11);
        arr.writeList();
        arr.remove(5);
        arr.writeList();
        System.out.println("indexOf('bbb') = " + arr.indexOf("bbb"));
        System.out.println("indexOf('asdf') = " + arr.indexOf("asdf"));


    }
}
