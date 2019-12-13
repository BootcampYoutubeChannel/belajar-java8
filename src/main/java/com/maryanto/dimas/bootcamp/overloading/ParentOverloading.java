package com.maryanto.dimas.bootcamp.overloading;

public class ParentOverloading {

    public void hitung() {
        System.out.println("10");
    }

    public void hitung(Integer value) {
        System.out.println(String.format("args: %d", value));
    }

    public void hitung(Integer value, Integer value1) {
        System.out.println(String.format("args: [%d, %d]", value, value1));
    }

    public void hitung(String value, Integer value1) {
        System.out.println(String.format("args: [%s, %d]", value, value1));
    }

    public void hitung(Integer value, String value1) {
        System.out.println(String.format("args: [%d, %s]", value, value1));
    }

    public void hitung(String value, String value1, String value2) {
        System.out.println(String.format("args: [%s, %s, %s]", value, value1, value2));
    }
}