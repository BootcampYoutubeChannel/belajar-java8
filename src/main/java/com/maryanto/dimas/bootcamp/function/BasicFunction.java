package com.maryanto.dimas.bootcamp.function;

public class BasicFunction {

    public static Integer getYearsOld(){
        System.out.println("Umur saya adalah 25");
        return 25;
    }

    public static void setNamaLengkap(){
        System.out.println("Nama lengkap saya adalah Dimas Maryanto");
    }

    public static void main(String[] args) {
        System.out.println(String.format("Umur saya sekarang adalah %d", getYearsOld()));

        System.out.println(String.format("Umur saya sekarang adalah %d", getYearsOld()));

        System.out.println(String.format("Umur saya sekarang adalah %d", getYearsOld()));

        setNamaLengkap();
    }
}