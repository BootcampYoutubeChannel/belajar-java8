package com.maryanto.dimas.bootcamp.interfaces;

public class MainApplication {

    public static void main(String[] args) {
        SportBikes testHonda = new HondaCBR1000RR();
        System.out.println(testHonda.toString());

        testHonda = new KawasakiZx10R();
        System.out.println(testHonda.toString());
    }
}