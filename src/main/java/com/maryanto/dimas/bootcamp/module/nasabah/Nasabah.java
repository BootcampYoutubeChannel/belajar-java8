package com.maryanto.dimas.bootcamp.module.nasabah;

import java.math.BigDecimal;

import com.maryanto.dimas.bootcamp.module.tabungan.Tabungan;

public class Nasabah {

    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        BigDecimal sayaMenabung = tabungan.nabung(new BigDecimal(10000), new BigDecimal(5000));
        System.out.println(String.format("Saya menabung sebesar Rp. %2.0f", sayaMenabung));
    }

    
}