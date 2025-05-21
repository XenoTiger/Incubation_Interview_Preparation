package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        //HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Niraj");
        set.add("Virat");
        set.add("Ronaldo");
        set.add("Ronaldo");
        set.add(null);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("*******************");

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Niraj");
        linkedHashSet.add("Virat");
        linkedHashSet.add("Ronaldo");
        linkedHashSet.add("Ronaldo");
        linkedHashSet.add(null);
        linkedHashSet.forEach(System.out::println);

        System.out.println("*******************");

        //TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Niraj");
        treeSet.add("Virat");
        treeSet.add("Ronaldo");
        treeSet.add("Ronaldo");
        // treeSet.add(null);  does not allow null values
        treeSet.forEach(System.out::println);

    }
}
