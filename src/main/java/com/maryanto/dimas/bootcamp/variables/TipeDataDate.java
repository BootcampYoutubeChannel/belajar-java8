package com.maryanto.dimas.bootcamp.variables;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// import java.util.Date;
// import java.text.SimpleDateFormat;

public class TipeDataDate {
    public static void main(String[] args) {
        // Date tanggalSekarang = new Date();
        // SimpleDateFormat dateFormater = new SimpleDateFormat("dd MMM
        // yyyy'T'HH:mm:ss");

        LocalDate tanggalSekarang = LocalDate.now();
        System.out.println(String.format("sekarang tanggal : %s", tanggalSekarang));

        LocalDateTime tanggalDanWaktuSekarang = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy'T'HH:mm:ss");
        System.out
                .println(String.format("sekarang tanggal dan waktu : %s", dateFormat.format(tanggalDanWaktuSekarang)));

        LocalTime waktuSekarang = LocalTime.now();
        System.out.println(String.format("sekarang waktu : %s", waktuSekarang));
    }
}