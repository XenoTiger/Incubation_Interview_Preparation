package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ravi");
        arrayList.add("Niraj");
        arrayList.add("Virat");
        arrayList.add("Ronaldo");

        //using iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //using enhanced for-loop
        for (String s : arrayList) {
            System.out.println(s);
        }

        //using forEach
        arrayList.forEach(System.out::println);
    }
}
