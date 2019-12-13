package com.maryanto.dimas.bootcamp.inheritances;

public class Sepeda {

    protected Integer roda = 2;
    private Long speed = 20l;

    public Long getKecepatan() {
        return this.speed;
    }

    public Long getKecepatan(Long tambahSpeed) {
        return this.speed + tambahSpeed;
    }

}