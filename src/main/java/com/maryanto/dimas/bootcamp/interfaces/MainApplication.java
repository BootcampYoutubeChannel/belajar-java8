package com.maryanto.dimas.bootcamp.interfaces;

public class MainApplication {

    public static void main(String[] args) {
        Motor hondaCbr = new Motor();
        hondaCbr.setKecepatan(100l);

        System.out.println(
            String.format(
                "Kecepatan motor honda cbr %d dan jumlah rodanya adalah %d",
                hondaCbr.getKecepatan(), 
                hondaCbr.getJumlahRoda()
            )
        );

        Mobil suzukiErtiga = new Mobil();
        suzukiErtiga.setKecepatan(250l);

        System.out.println(
            String.format(
                "Kecepatan mobile suzuki ertiga %d dan jumlah rodanya adalah %d",
                suzukiErtiga.getKecepatan(), 
                suzukiErtiga.getJumlahRoda()
            )
        );

    }
}