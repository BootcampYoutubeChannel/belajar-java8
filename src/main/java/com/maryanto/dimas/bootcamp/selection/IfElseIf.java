package com.maryanto.dimas.bootcamp.selection;

public class IfElseIf {
    public static void main(String[] args) {

        String namaLengkap = "Dimas Maryanto";
        if (namaLengkap.equals("dimas maryanto")) {
            System.out.println("Data yang dibandingkan sama");
        } else if (namaLengkap.equalsIgnoreCase("dimas maryanto")) {
            System.out.println("Data yang dibandingkan beda tapi sama ketika menggunakan huruf kecil");
        } else {
            System.out.println("Data yang dibandikan berbeda!");
        }
    }
}