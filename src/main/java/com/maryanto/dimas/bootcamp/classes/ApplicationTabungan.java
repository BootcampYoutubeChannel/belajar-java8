package com.maryanto.dimas.bootcamp.classes;

import java.math.BigDecimal;

public class ApplicationTabungan {

    public BigDecimal tarikDana(BigDecimal saldo, BigDecimal tarikTunai){
        return saldo.subtract(tarikTunai);
    }

    public static void main(String[] args) {
        BigDecimal nabungPertama = Tabungan.nabung(BigDecimal.ZERO, new BigDecimal(10000));
        System.out.println(String.format("Tabungan pertama saya %2.0f", nabungPertama));

        Tabungan tabungan = new Tabungan();
        System.out.println(String.format("Penarikan tabungan %2.0f",
                tabungan.tarikDana(new BigDecimal(10000), new BigDecimal(5000))));

        Deposito deposito = new Deposito();
        BigDecimal setoranAwalDeposito = deposito.setoranAwal(new BigDecimal(1000_000));
        System.out.println(String.format("Setoran awal deposito : %2.0f", setoranAwalDeposito));

        ApplicationTabungan appTabungan = new ApplicationTabungan();
        System.out.println(String.format("Application Penarikan tabungan %2.0f", appTabungan.tarikDana(new BigDecimal(10000), new BigDecimal(5000))));
    }
}