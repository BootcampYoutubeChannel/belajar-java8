package com.maryanto.dimas.bootcamp.init;

public class InitValue {

    public InitValue(String namaLangkap) {
        this.nama = namaLangkap;
        System.out.println("Nama Lengkap");
    }

    public InitValue(String namaDepan, String namaBelakang) {
        this.nama = new StringBuilder(namaDepan).append(" ").append(namaBelakang).toString() ;
        System.out.println("Nama depan + nama belakang");
    }

    private String nama;

    public String getName(){
        return this.nama;
    }
}