package Collections;

public class CustomHashMapExample {

    public static void main(String[] args) {
        CustomHashMap<Integer, String> customHashMap = new CustomHashMap<>();
        customHashMap.putOperation(1, "Niraj");
        customHashMap.putOperation(2, "Virat");
        customHashMap.putOperation(3, "Ronaldo");

        customHashMap.traverseMap();

        System.out.println("After replacing elements..");
        customHashMap.putOperation(3, "Dhoni");
        customHashMap.traverseMap();

        System.out.println("Get operation: " + customHashMap.getOperation(2));

    }

}
