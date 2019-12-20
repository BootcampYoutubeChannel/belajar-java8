package com.maryanto.dimas.bootcamp.collections;

import java.util.ArrayList;
import java.util.List;

public class DataWithGeneric {

    public static void main(String[] args) {
        List<String> listOfEmployee = new ArrayList<>();
        listOfEmployee.add("Dimas maryanto");
        listOfEmployee.add("Muhamad Yusuf");
        listOfEmployee.add("Prima");

        for(String employee: listOfEmployee){
            System.out.println(String.format("employeeName: %s", employee));
        }
    }
}