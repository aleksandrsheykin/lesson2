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
        if(capacity<0) return;
        size = capacity;
        arr = (T[]) new Object[size];
    }

    public void add(T a) {
        T[] tmp = (T[]) new Object[size+1];
        for (int i=0; i<size; i++)
            tmp[i] = arr[i];
        tmp[size++] = a;
        arr = tmp;
    }

    public void add(T a, int ind) {
        if(ind<0) return;
        if(ind>=size) {
            T[] tmp = (T[]) new Object[ind+1];
            for (int i=0; i<size; i++)
                tmp[i] = arr[i];
            size = ind+1;
            arr = tmp;
        }
        arr[ind] = a;
    }

    public void remove(int ind) {
        if(ind>size) return;
        if(ind<0) return;

        T[] tmp = (T[]) new Object[size-1];
        for (int i=0; i<ind; i++)
            tmp[i] = arr[i];
        for (int i=ind+1; i<size; i++)
            tmp[i-1] = arr[i];
        size--;
        arr = tmp;
    }

    public int indexOf(T a) {
        for (int i=0; i<size; i++) {
            if(arr[i] == a) return i;
        }
        return -1;
    }

    public void writeList() {
        for (T v : arr)
            System.out.print("["+v+"] ");
        System.out.println("size="+size);
    }
}
