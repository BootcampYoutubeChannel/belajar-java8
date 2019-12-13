package com.maryanto.dimas.bootcamp.function;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FunctionArgs {

    public static Long getYearsOld(LocalDate date) {
        return ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    public static void setNamaLengkap(String namaLengkap) {
        System.out.println("Nama lengkap saya adalah " + namaLengkap);
    }

    public static void main(String[] args) {
        Long umurSaya = getYearsOld(LocalDate.of(1999, 01, 10));
        System.out.println(String.format("Umur saya sekarang adalah %d", umurSaya));

        umurSaya = getYearsOld(LocalDate.of(1998, 10, 10));
        System.out.println(String.format("Umur saya sekarang adalah %d", umurSaya));

        umurSaya = getYearsOld(LocalDate.of(1995, 10, 10));
        System.out.println(String.format("Umur saya sekarang adalah %d", umurSaya));

        setNamaLengkap("Dimas Maryanto");
    }
}