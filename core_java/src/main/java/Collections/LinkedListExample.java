package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ravi");
        linkedList.add("Niraj");
        linkedList.add("Virat");
        linkedList.add("Ronaldo");

        //using iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //using enhanced for-loop
        for (String s : linkedList) {
            System.out.println(s);
        }

        //using forEach
        linkedList.forEach(System.out::println);
    }
}
