package com.maryanto.dimas.bootcamp.operator;

public class OperatorPerbandingan {

    public static void main(String[] args) {
        Integer bilA = 10;
        Integer bilB = 20;

        System.out.println(String.format("10 == 20 => %s", (bilA == bilB)));

        System.out.println(String.format("10 == 10 => %s", (bilA == 10)));

        System.out.println(String.format("10 != 20 => %s", (bilA != bilB)));

        System.out.println(String.format("10 > 20 => %s", (bilA > bilB)));

        System.out.println(String.format("10 > 10 => %s", (bilA > 10)));

        System.out.println(String.format("10 >= 10 => %s", (bilA >= 10)));

        System.out.println(String.format("true ! => %s", !true));
    }
}