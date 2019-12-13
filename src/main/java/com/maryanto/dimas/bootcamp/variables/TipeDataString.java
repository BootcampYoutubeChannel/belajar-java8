package com.maryanto.dimas.bootcamp.variables;

public class TipeDataString {

    public static void main(String[] args) {

        // char sebuahKarakter = 'D';
        // System.out.println("Ini adalah sebuah karakter :"+ sebuahKarakter);

        String sebuahString = "Dimas Maryanto";
        System.out.println("ini adalah nilai dari sebuah String: " + sebuahString.toUpperCase());
        System.out.println("");
        System.out.println("ini adalah nilai dari sebuah String pada index ke 3: " + sebuahString.charAt(3));
        System.out.println("");
        System.out.println("apakah nilai " + (sebuahString.equalsIgnoreCase("dimas maryanto") ? "Sama" : "Berbeda!"));

    }
}