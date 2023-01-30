package mypackage.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Nursalim", "Nursalim Value");
        map.put("Ziah", "Ziah Value");
        map.put("Toni", "Toni Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(var entry: entries){
//            System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
