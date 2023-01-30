package mypackage.collection;

import java.util.*;

public class SortedMapApp {

    public static void main(String[] args) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
        sortedMap.put("Nani", "Nani");
        sortedMap.put("Ayu", "Ayu");
        sortedMap.put("Budi", "Budi");

        for (var key : sortedMap.keySet()){
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
    }
}
