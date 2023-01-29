package mypackage.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("Nur");
        queue.add("Salim");
        queue.add("Al");
        queue.add("Farizi");
//        for (int i = 0; i < 10; i++){
//            queue.add(String.valueOf(i));
//        }

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
