package com.maryanto.dimas.bootcamp.classes;

import java.math.BigDecimal;

public class Tabungan {

    public static BigDecimal nabung(BigDecimal saldo, BigDecimal setorTunai){
        return saldo.add(setorTunai);
    }

    public BigDecimal tarikDana(BigDecimal saldo, BigDecimal tarikTunai){
        return saldo.subtract(tarikTunai);
    }
}