package com.maryanto.dimas.bootcamp.collections;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class DataWithGeneric {

    public static void main(String[] args) {
        // List<String> listOfEmployee = new ArrayList<>();
        // listOfEmployee.add("Dimas maryanto");
        // listOfEmployee.add("Muhamad Yusuf");
        // listOfEmployee.add("Prima");

        // for(String employee: listOfEmployee){
        //     System.out.println(String.format("employeeName: %s", employee));
        // }

        Map<String, Date> mapOfDates = new HashMap<>();
        mapOfDates.put("sekarang", Date.valueOf(LocalDate.now()));
        mapOfDates.put("besok", Date.valueOf(LocalDate.now().plusDays(1)));
        mapOfDates.put("kemarin", Date.valueOf(LocalDate.now().minusDays(1)));

        for(Map.Entry<String,Date> entry: mapOfDates.entrySet()){
            System.out.println(String.format("{ %s: %s}", entry.getKey(), entry.getValue()));
        }
    }
}