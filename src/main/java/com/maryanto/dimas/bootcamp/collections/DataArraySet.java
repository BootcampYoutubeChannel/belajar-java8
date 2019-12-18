package com.maryanto.dimas.bootcamp.collections;

import java.util.List;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

public class DataArraySet {

    public static void main(String[] args) {
        Set datas = new HashSet<>();

        // add an element to arrays
        datas.add("Dimas Maryanto");
        datas.add("Dimas Maryanto");
        datas.add("Dimas Maryanto");
        datas.add("Sistem Informasi");
        datas.add(11);
        datas.add(false);
        datas.add(Date.valueOf(LocalDate.now()));

        datas.remove("Dimas Maryanto");
        boolean exist = datas.equals("Dimas Maryanto");
        System.out.println(String.format("Data \"Dimas Maryanto\" apakah tersedia ? %s", exist));

        System.out.println(String.format("Jumlah data dari element set adalah %d", datas.size()));
        for (Object data : datas) {
            System.out.println(String.format("%s", data.toString()));
        }
    }
}