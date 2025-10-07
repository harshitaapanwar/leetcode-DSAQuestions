package com.h.dsa;
import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
 
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
 
        System.out.println("Head of queue: " + queue.peek());
    }
}
