package com.maryanto.dimas.bootcamp.inheritances;

public class InheritanceApplication {
    public static void main(String[] args) {
        Mobil honda = new Mobil();
        System.out.println(honda.getMesin());

        Sepeda ontel = new Sepeda();
        System.out.println(String.format("jumlah roda sepeda ontel adalah %d", ontel.roda));
    }
}