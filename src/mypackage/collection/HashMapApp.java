package mypackage.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Nursalim");
        map.put("lastName", "Al Farizi");
        map.put("city", "Brebes");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("lastName"));
        System.out.println(map.get("city"));

    }
}
