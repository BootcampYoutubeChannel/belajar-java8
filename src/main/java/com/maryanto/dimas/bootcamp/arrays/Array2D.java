package com.maryanto.dimas.bootcamp.arrays;

public class Array2D {

    public static void main(String[] args) {
        String[][] mahasiswa = {
            {"1051148", "Dimas Maryanto", "SI"},
            {"1011148", "Muhamad Yusuf", "IT"},
            {"1021148", "Prima", "IF"},
            {"1021148", "Abdul", "IF"}
        };

        mahasiswa[3][0] = "0111111";

        // System.out.println(String.format("Nilai dari index x[1] y[2] adalah %s", mahasiswa[1][2]));
        // System.out.println(String.format("Nilai dari index x[2] y[0] adalah %s", mahasiswa[2][0]));

        for(int i = 0; i < mahasiswa.length; i++){
            for(int j = 0; j < mahasiswa[i].length; j++){
                System.out.print(String.format("\t %s \t|", mahasiswa[i][j]));
            }
            System.out.println("");
        }


    }
}