package com.maryanto.dimas.bootcamp.overrides;

public class MainApplication {

    public static void main(String[] args) {
        ParentOverride data = new ParentOverride();
        data.hitung();

        data = new ChildOverride();
        data.hitung();
    }
}