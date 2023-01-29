package mypackage.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.offerFirst("Nursalim");
        stack.offerFirst("Al Farizi");
        stack.offerFirst("Brebes");

//        for (var val : deque){
//            System.out.println(val);
//        }

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());


        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Naura");
        queue.offerLast("Krasiva");
        queue.offerLast("Jakarta");

//        for (var val : deque){
//            System.out.println(val);
//        }

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
