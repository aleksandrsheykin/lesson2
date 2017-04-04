package com.company;

import java.lang.reflect.Array;

/**
 * Created by admin on 04.04.2017.
 */
public class ArrList<T> {
    private int size = 0;
    private T[] arr;

    ArrList() {
        arr = (T[]) new Object[0];
    }

    ArrList(int capacity) {
        arr = (T[]) new Object[capacity];
    }

    public void add(T a) {
        arr[size++] = a;
    }

    public void add(T a, int ind) {
        if(ind>size) {
            size = ind;
            T[] tmp = (T[]) new Object[ind+1];
            
        } else {
            arr[ind] = a;
        }
    }

    public void remove(int ind) {
        //arr[ind].remove;
    }

    public void find(T a) {
        //
    }

    public void writeList() {
        for (T v : arr)
            System.out.print("["+v+"] ");
    }
}
