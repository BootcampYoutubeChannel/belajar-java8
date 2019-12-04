package com.maryanto.dimas.bootcamp.inheritances;

public class Mobil extends Sepeda {

    private String mesin = "Inline 4";

    public String getMesin() {
        super.roda = 4;
        return String.format("Konfigurasi mesin %s jumlah rodanya adalah %s", this.mesin, super.roda);
    }

}