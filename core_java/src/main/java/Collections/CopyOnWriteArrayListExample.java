package Collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Ravi");
        copyOnWriteArrayList.add("Niraj");
        copyOnWriteArrayList.add("Virat");
        copyOnWriteArrayList.add("Ronaldo");

        System.out.println("Original List: ");
        copyOnWriteArrayList.forEach(System.out::println);

        Iterator<String> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println("Reading item: " + s);

            if ("Niraj".equals(s)) {
                copyOnWriteArrayList.add("Dhoni"); // in case of ArrayList , we will get ConcurrentModificationException
                // iterator.remove(); gives UnsupportedOperationException
            }

        }


        System.out.println("List after modification: ");
        copyOnWriteArrayList.forEach(System.out::println);

    }
}
