package com.maryanto.dimas.bootcamp.function;

public class FunctionArgs {

    public static Integer getYearsOld(Integer umur){
        return umur;
    }

    public static void setNamaLengkap(String namaLengkap){
        System.out.println("Nama lengkap saya adalah "+ namaLengkap);
    }

    public static void main(String[] args) {
        Integer umurSaya = getYearsOld(25);
        System.out.println(String.format("Umur saya sekarang adalah %d", umurSaya));

        umurSaya = getYearsOld(26);
        System.out.println(String.format("Umur saya sekarang adalah %d", umurSaya));

        umurSaya = getYearsOld(27);
        System.out.println(String.format("Umur saya sekarang adalah %d", umurSaya));

        setNamaLengkap("Dimas Maryanto");
    }
}