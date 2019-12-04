package com.maryanto.dimas.bootcamp.inheritances;

public class Mobil extends Sepeda {

    private String mesin = "Inline 4";

    public String getMesin() {
        super.roda = 4;
        return String.format("Konfigurasi mesin %s jumlah rodanya adalah %s maximum kecepatannya adalah %s", this.mesin, super.roda, this.getKecepatan(20l));
    }

    public Long getKecepatan(){
        return 250l;
    }

    public Long getKecepatan(Long tambahSpeed){
        return this.getKecepatan() + tambahSpeed;
    }

}