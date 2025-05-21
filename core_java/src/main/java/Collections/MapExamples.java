package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {

        //HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Ronaldo");
        hashMap.put(1, "Niraj");
        hashMap.put(2, "Virat");
        hashMap.put(null, "Data");
        hashMap.put(null, null);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        if (hashMap.containsKey(1)) {
            System.out.println("Value is present: " + hashMap.get(1));
        }

        System.out.println("*************************");

        //LinkedHashMap(Maintains insertion order)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Ronaldo");
        linkedHashMap.put(1, "Niraj");
        linkedHashMap.put(2, "Virat");
        linkedHashMap.put(null, "Data");
        linkedHashMap.put(null, null);

        for (Map.Entry<Integer, String> mapEntry : linkedHashMap.entrySet()) {
            System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
        }

        System.out.println("*************************");

        //TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Ronaldo");
        treeMap.put(1, "Niraj");
        treeMap.put(2, "Virat");
        treeMap.put(4, null);
        // treeMap.put(null, "Data"); does not allow null key


        for (Map.Entry<Integer, String> treeMapEntry : treeMap.entrySet()) {
            System.out.println(treeMapEntry.getKey() + " : " + treeMapEntry.getValue());
        }
    }
}
