package com.maryanto.dimas.bootcamp.selection;

public class SwitchStatementDetail {
    public static void main(String[] args) {

        Integer ip = 4;
        switch (ip) {
        case 4:
            System.out.println("A");
        case 3:
            System.out.println("B");
        case 2:
            System.out.println("C");
            break;
        case 1:
            System.out.println("D");
            break;
        default:
            System.out.println("E");
        }
    }
}