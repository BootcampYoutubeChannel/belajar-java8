package com.maryanto.dimas.bootcamp.interfaces;

public class Motor implements Mesin, Roda {

    private Long kecepatan;

    public void setKecepatan(Long kecepatan){
        this.kecepatan = kecepatan;
    }

    public Long getKecepatan(){
        return this.kecepatan;
    }

    public Integer getJumlahRoda(){
        return 2;
    }
}