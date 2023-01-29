package mypackage.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("One");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Nursalim");
        mutable.add("Al");
        mutable.add("Farizi");

        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Nani", "Indriyani");

    }
}
