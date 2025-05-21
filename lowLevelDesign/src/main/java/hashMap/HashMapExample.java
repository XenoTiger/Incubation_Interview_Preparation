package hashMap;

import java.util.LinkedList;

public class HashMapExample {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //total elements
        private int N; //total buckets(array size)
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int getHashCode(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        private int searchInLinkedList(K key, int bucketIndex) {
            LinkedList<Node> linkedList = buckets[bucketIndex];
            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public void put(K key, V val) {
            int bucketIndex = getHashCode(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            if (dataIndex == -1) {
                buckets[bucketIndex].add(new Node(key, val));
                n++;
            } else {
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = val;
            }
        }

        public V get(K key) {
            int bucketIndex = getHashCode(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            if (dataIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bucketIndex = getHashCode(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            if (dataIndex == -1) {
                return false;
            } else {
                Node node = buckets[bucketIndex].get(dataIndex);
                return true;
            }
        }

        public V remove(K key) {
            int bucketIndex = getHashCode(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);
            if (dataIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].remove();
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

}
