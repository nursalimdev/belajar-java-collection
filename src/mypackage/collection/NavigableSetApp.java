package mypackage.collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Nursalim", "Al", "Farizi", "Brebes", "Losari"));

        for (var name: names){
//            System.out.println(name);
        }

        NavigableSet<String> descendingSet = names.descendingSet();

        for (var desc: descendingSet){
//            System.out.println(desc);
        }

        // Mencari element dari head sampai Farizi, Farizi nya diinclude
        NavigableSet<String> farizi = names.headSet("Farizi", true);
        for (var a : farizi){
            System.out.println(a);
        }

        // immutable navigableset
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Halah");



    }
}
