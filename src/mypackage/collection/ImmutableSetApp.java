package mypackage.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("One");

        Set<String> mutable = new HashSet<>();
        mutable.add("Nursalim");
        mutable.add("Al");
        mutable.add("Farizi");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Satu", "Dua", "Tiga");
        set.remove("Satu");

    }
}
