package hashMap;

public class HashMapClient {

    public static void main(String[] args) {
        HashMapExample.HashMap<Integer, String> map = new HashMapExample.HashMap<>();

        map.put(1, "Niraj");
        map.put(2, "Virat");

      //  map.put(2, "Niraj");

        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.remove(2));
    }

}
