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

        if(ind>=size) {     //вставляем в конец или за край массива
            T[] tmp = (T[]) new Object[ind+1];
            for (int i=0; i<size; i++)
                tmp[i] = arr[i];
            size = ind+1;
            arr = tmp;
            arr[ind] = a;
        } else {    //вставляем в середину или начало массива
            T[] tmp = (T[]) new Object[size+1];
            for (int i=0; i<ind; i++)
                tmp[i] = arr[i];
            for (int i=ind; i<size; i++)
                tmp[i+1] = arr[i];
            size++;
            arr = tmp;
            arr[ind] = a;
        }
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

    public int set(T a, int ind) {
        if(ind<0) return -1;

        if(ind>size) {
            this.add(a, ind);
        } else {
            arr[ind] = a;
        }
        return ind;
    }

    public T get(int ind) {
        if (ind<0 || ind>size) return null;
        return arr[ind];
    }

    public void writeList() {
        for (T v : arr)
            System.out.print("["+v+"] ");
        System.out.println("size="+size);
    }
}
