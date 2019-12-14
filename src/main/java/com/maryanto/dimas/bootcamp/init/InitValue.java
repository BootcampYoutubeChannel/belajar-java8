package com.maryanto.dimas.bootcamp.init;

public class InitValue {

    public InitValue() {
        System.out.println("Construktor di panggil");
    }

    private String nama;

    public String getName(){
        return this.nama;
    }
}