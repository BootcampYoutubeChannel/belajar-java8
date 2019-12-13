package com.maryanto.dimas.bootcamp.operator;

public class OperatorMatematika {

    public static void main(String[] args) {
        Integer bil1 = 10;
        Integer bil2 = 20;
        Integer bil3 = 30;

        Integer bil4 = bil1 + bil2 + bil3;
        System.out.println(String.format("bil4 = 10 + 20 + 30 => %s", bil4));

        Integer bil5 = bil3 - bil1;
        System.out.println(String.format("bil5 = 30 - 10 => %s", bil5));

        Integer bil6 = bil4 / bil5;
        System.out.println(String.format("bil6 = 60/20 => %s", bil6));

        bil6++;
        System.out.println(String.format("bil6++ => %s", bil6));

        bil6 += 5;
        System.out.println(String.format("bil6 = bil6 + 5 => %s", bil6));
    }
}