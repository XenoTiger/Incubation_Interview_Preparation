package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

class Pair<K, V> {  //

    K key;
    V value;  // follow good prtactices

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}

//consider using design patterns

public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private final ArrayList<LinkedList<Pair<K, V>>> buckets;
    private int size;

    public CustomHashMap() {
        buckets = new ArrayList<>(DEFAULT_CAPACITY);
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets.add(new LinkedList<>());
        }
        size = 0;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % DEFAULT_CAPACITY;  // todo check for custom
    }

    public void putOperation(K key, V value) {    //todo check for capacity
        int bucketIndex = getBucketIndex(key);
        LinkedList<Pair<K, V>> bucket = buckets.get(bucketIndex);
        for (Pair<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }
        bucket.add(new Pair<>(key, value));
        size++;

    }

    public V getOperation(K key) {   //todo achieve o(1) time
        int bucketIndex = getBucketIndex(key);
        LinkedList<Pair<K, V>> bucket = buckets.get(bucketIndex);
        for (Pair<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return null;
    }

    public void traverseMap() {
        for (LinkedList<Pair<K, V>> bucket : buckets) {
            for (Pair<K, V> pair : bucket) {
                System.out.println("Key: " + pair.key + ", " + "Value: " + pair.value);
            }
        }
    }
}
