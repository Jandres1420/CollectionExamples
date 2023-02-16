package org.example.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashmapMain {
    public static void main(String[] args) {
        // create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        System.out.println("HashMap: " + hashMap);

        // create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);
        treeMap.put("four", 4);
        treeMap.put("five", 5);
        System.out.println("TreeMap: " + treeMap);

        // create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);
        linkedHashMap.put("five", 5);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
