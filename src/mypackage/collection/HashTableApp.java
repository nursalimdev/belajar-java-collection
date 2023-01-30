package mypackage.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("satu", "Nursalim");
        map.put("dua", "Aku");

        for (var key: map.keySet()) {
            System.out.println(key);
        }
    }
}
