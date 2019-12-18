package com.maryanto.dimas.bootcamp.collections;

import java.util.List;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class DataArrayList {

    public static void main(String[] args) {
        List datas = new ArrayList();

        // add an element to arrays
        datas.add("Dimas Maryanto");
        datas.add("Sistem Informasi");
        datas.add(11);
        datas.add(false);
        datas.add(Date.valueOf(LocalDate.now()));

        // show element by index
       Object dataKe4 =  datas.get(4);
       System.out.println(String.format("Data dari element ke %d adalah %s", 4, dataKe4.toString()));

       Object dataKe2 =  datas.get(2);
       System.out.println(String.format("Data dari element ke %d adalah %s", 2, dataKe2.toString()));

       try{
           Object dataKe5 =  datas.get(5);
           System.out.println(String.format("Data dari element ke %d adalah %s", 5, dataKe5.toString()));
       }catch (IndexOutOfBoundsException iobe){
            System.err.println("Tidak dapat menampilkan data ke 5 dari element datas");
       }

       Object dataKe1 =  datas.get(1);
       System.out.println(
           String.format("Data dari element ke %d sebelum di update adalah %s", 1, dataKe1.toString()));

       datas.set(1, "SI");
       dataKe1 =  datas.get(1);
       System.out.println(
           String.format("Data dari element ke %d setelah di update adalah %s", 1, dataKe1.toString()));

    
       datas.remove("Dimas Maryanto");
       boolean exist = datas.equals("Dimas Maryanto");
       System.out.println(String.format("Data \"Dimas Maryanto\" apakah tersedia ? %s", exist));

       for(int i = 0; i < datas.size(); i++){
           System.out.println(String.format("Element ke %d adalah %s", i, datas.get(i).toString()));
       }
    }
}