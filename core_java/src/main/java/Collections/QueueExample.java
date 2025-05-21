package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {

        //PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Niraj");
        priorityQueue.add("Virat");
        priorityQueue.add("Ronaldo");
        priorityQueue.add("Avenger");
        System.out.println("head: " + priorityQueue.element());
        System.out.println("head: " +priorityQueue.peek());

        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        priorityQueue.remove();
        priorityQueue.poll();
        System.out.println("After removing: ");
        priorityQueue.forEach(System.out::println);

        //Dequeue
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Niraj");
        deque.add("Virat");
        deque.add("Ronaldo");
        System.out.println("Dequeue traversal: ");
        deque.forEach(System.out::println);
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

    }
}
