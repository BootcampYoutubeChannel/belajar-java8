package com.maryanto.dimas.bootcamp.loop;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(String.format("i[%d] => ", i));
            for (int j = 0; j < 5; j++) {
                System.out.print(String.format("{%d}, ", j));
            }
            System.out.println();
        }

    }
}