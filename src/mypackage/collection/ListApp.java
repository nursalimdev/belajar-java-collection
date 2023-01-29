package mypackage.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        List<String> names = new LinkedList<>();
        names.add("Nursalim");
        names.add("Al");
        names.add("Farizi");
        for (var name: names){
            System.out.println(name);
        }

        names.set(0, "Nani");
        for (var name: names){
            System.out.println(name);
        }

        names.remove(1);
        System.out.println(names.get(0));
    }
}
