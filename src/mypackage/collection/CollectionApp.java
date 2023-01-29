package mypackage.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Nursalim");
        names.add("Al");
        names.add("Farizi");
        names.addAll(List.of("Nani", "Indriyani", "Naura"));

        for(var name : names){
            System.out.println(name);
        }

        System.out.println("REMOVE");
        names.remove("Al");
        names.removeAll(List.of("Nani", "Naura"));
        for (var name : names){
            System.out.println(name);
        }

        System.out.println(names.contains("Nursalim"));
        System.out.println(names.containsAll(List.of("Farizi", "Indriyani")));

        System.out.println(names.size());

    }
}
