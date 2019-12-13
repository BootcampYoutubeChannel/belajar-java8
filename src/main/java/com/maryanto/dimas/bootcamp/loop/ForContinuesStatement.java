package com.maryanto.dimas.bootcamp.loop;

public class ForContinuesStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2 || i == 8)
                continue;
            System.out.println(String.format("index ke %d", i));
        }
    }
}