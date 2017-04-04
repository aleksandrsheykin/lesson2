package com.company;

import java.lang.reflect.Array;

/**
 * Created by admin on 04.04.2017.
 */
public class ArrList<T> {
    private int size = 0;
    //private <T> arr[];
    //<T>[] arr = new Array(1);
    //private Double[] arr;
    //private <T>[] arr;
    //private Object<T> arr = new Object<>();
    //private Object arr;
    private Array arr [];

    ArrList() {
        arr = new Array[0];
    }

    ArrList(int capacity) {
        arr = new Array[capacity];
    }

    public void add(T a) {
        arr[0] = a;
    }

    public void remove(int ind) {
        //arr[ind].remove;
    }

    public void find(T a) {
        //
    }

    public void writeList() {
        System.out.println(arr.toString());
    }
}
