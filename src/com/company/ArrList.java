package com.company;

import java.lang.reflect.Array;

/**
 * Created by admin on 04.04.2017.
 */
public class ArrList<T extends Number> {
    double[] arr;

    public void add(T a) {
        arr[arr.length] = (double) a;
    }

    public void remove(int ind) {
        //arr[ind].remove;
    }

    public void finde(T a) {
        //
    }
}
