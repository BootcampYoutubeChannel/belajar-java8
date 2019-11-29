package com.maryanto.dimas.bootcamp.loop;

public class ForBreakStatement{

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(String.format("index ke %d", i));
            if (i == 8) break;
        }
    }
}