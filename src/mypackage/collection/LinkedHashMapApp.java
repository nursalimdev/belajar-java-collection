package mypackage.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one", "Nursalim");
        map.put("two", "Al");
        map.put("three", "Farizi");

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }
    }
}
