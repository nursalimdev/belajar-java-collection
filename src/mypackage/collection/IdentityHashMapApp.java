package mypackage.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
        Map<String, String> map = new IdentityHashMap<>();
        String key1 = "name.first";
        String name = "name";
        String first = "first";
        String key2 = name + "." + first;
        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Nursalim");
        map.put(key2, "Nursalim");

        System.out.println(map.size());
    }
}
