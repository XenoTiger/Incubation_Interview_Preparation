package lruCache;

public class LruCacheClient {

    public static void main(String[] args) {
         LruCache cache = new LruCache(3);

         cache.put(1, 1);
         cache.put(2, 2);
         cache.put(3, 3);

        System.out.println(cache.get(2));

        cache.put(4,4);
        System.out.println("Cache after adding key 4 (should evict LRU): " + cache);

    }
}
