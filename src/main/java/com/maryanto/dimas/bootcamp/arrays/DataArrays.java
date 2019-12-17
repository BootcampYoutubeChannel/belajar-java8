package com.maryanto.dimas.bootcamp.arrays;

public class DataArrays {

    public static void main(String[] args) {
        Integer[] values = {1, 2, 3, 4, 5, 10, 50};
        for(int i = 0; i < values.length; i++){
            System.out.println(
                String.format("Nilai dari index ke %d adalah %d", i, values[i])
            );
        }
    }
}