package mypackage.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Nursalim", "Al", "Farizi");

        for (var name: names){
            System.out.println(name);
        }

        // Iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}