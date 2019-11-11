package com.maryanto.dimas.bootcamp.selection;

public class SwitchStatement{

    public static void main(String[] args) {
        String namaLengkap = "Dimas Maryanto";
        switch(namaLengkap){
            case "Dimas" :
                System.out.println("1");
                break;
            case "Dimas maryanto":
                System.out.println("2");
                break;
            case "Dimas Maryanto":
                System.out.println("3");
                break;
        }
    }
}