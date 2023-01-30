package mypackage.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("Nursalim", "Nursalim");
        navigableMap.put("Ayu", "Ayu");
        navigableMap.put("Tosa", "Tosa");

        for (var key: navigableMap.keySet()){
            System.out.println(key);
        }

        System.out.println(navigableMap.lowerKey("Nursalim"));
        System.out.println(navigableMap.higherKey("Nursalim"));
        System.out.println(navigableMap.floorKey("Tosa"));
        System.out.println(navigableMap.ceilingKey("Tosa"));

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(navigableMap);
        immutable.put("aa", "aa");


    }
}
