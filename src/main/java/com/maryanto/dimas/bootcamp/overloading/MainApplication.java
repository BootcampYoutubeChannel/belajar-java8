package com.maryanto.dimas.bootcamp.overloading;

public class MainApplication {

    public static void main(String[] args) {
        ParentOverloading data = new ParentOverloading();
        data.hitung("10", "Dimas Maryanto", "Test");

        ChildrenOverride child = new ChildrenOverride();
        // child.testThisKeyword();
        // child.testNotSpesific();
        child.testSuperKeyword();
    }
    
}