package mypackage.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Collections.emptyMap();
        Map<String, String> singletonMap = Collections.singletonMap("name", "Nursalim");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("nama", "Nursalim");
        mutable.put("blog", "https://www.nursalimdev.my.id");

        // konvert ke immutable
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "name", "Nursalim",
                "blog", "https://www.nursalimdev.my.id"
        );
//        map.put("a", "A"); error

    }
}
