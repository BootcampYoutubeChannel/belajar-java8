package com.maryanto.dimas.bootcamp.selection;

public class SwitchStatement{

    public static void main(String[] args) {
        Integer bil1 = 10;
        switch(bil1){
            case 20: 
                System.out.println("Nilai bilangan 1 adalah 20");
                break;
            case 5:
                System.out.println("Nilai bilangan 1 adalah 5");
                break;
            case 10:
                System.out.println("Nilai bilangan 1 adalah 10");
                break;
            default: 
                System.out.println("Tidak ada yang sama");
        }

        System.out.println("Execute finised");
    }
}
