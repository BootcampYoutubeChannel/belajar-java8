package com.maryanto.dimas.bootcamp.overloading;

public class ChildrenOverride extends ParentOverloading {

    @Override
    public void hitung() {
        System.out.println("20");
    }

    public void testThisKeyword(){
        this.hitung();
    }

    public void testSuperKeyword(){
        super.hitung();
    }

    public void testNotSpesific(){
        hitung();
    }
}