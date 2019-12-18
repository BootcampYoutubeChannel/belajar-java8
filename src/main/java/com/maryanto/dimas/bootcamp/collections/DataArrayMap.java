package com.maryanto.dimas.bootcamp.collections;

import java.util.HashMap;
import java.util.Map;

public class DataArrayMap {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("a", "Dimas Maryanto");
        map.put("b", "Muhamad Yusuf");
        map.put("c", "Abdul");
        map.put("d", "Himawan");
        map.put("a", "Aldi");

        System.out.println(String.format("jumlah data dalam map adalah %d", map.size()));

        map.forEach((key, value) -> { 
            System.out.println(
                "nilai key " + key + 
                " sedangkan valuenya " + value
            ); 
        });

        Object findByKeyA = map.get("a");
        System.out.println(String.format("find by key 'a' is %s", findByKeyA.toString()));

        map.remove("b");
        boolean keyBIsExist = map.containsKey("b");
        System.out.println(String.format("Key 'b' available %s", keyBIsExist));

    }
}