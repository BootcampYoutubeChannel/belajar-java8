package com.maryanto.dimas.bootcamp.arrays;

public class DataArrays {

    public static void main(String[] args) {
        // Integer[] values = {1, 2, 3, 4, 5, 10, 50};

        Integer[] values = new Integer[10];
        values[0] = 1;
        values[1] = 2;
        values[5] = 3;
        values[9] = 6;
        for (int i = 0; i < values.length; i++) {
            System.out.println(String.format("Nilai dari index ke %d adalah %d", i, values[i]));
        }
    }
}