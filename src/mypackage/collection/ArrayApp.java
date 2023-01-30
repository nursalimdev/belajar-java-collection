package mypackage.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Nani", "Naura", "Joni", "Toni", "Ziah");

        Object[] namesArr = names.toArray();
//        for(var nama: namesArr){
//            System.out.println(nama);
//        }
        System.out.println(Arrays.toString(namesArr));


        String[] namesStr = names.toArray(new String[]{});
//        for (var nama : namesStr){
//            System.out.println(nama);
//        }
        System.out.println(Arrays.toString(namesStr));

    }
}
