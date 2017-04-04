package com.company;

public class Main {

    public static void main(String[] args) {
        ArrList<String> arr = new ArrList<>(5);
        arr.writeList();
        arr.add("aaa");
        arr.writeList();
        arr.add("bbb", 1);
        arr.writeList();
        arr.add("ccc", 4);
        arr.writeList();
        arr.add("ddd", 16);
        arr.writeList();
        arr.remove(5);
        arr.remove(4);
        arr.writeList();
        System.out.println("indexOf('bbb') = " + arr.indexOf("bbb"));
        System.out.println("indexOf('asdf') = " + arr.indexOf("asdf"));
        arr.set("fff", 3);
        System.out.println("arr.get(3) = " + arr.get(3));



    }
}
