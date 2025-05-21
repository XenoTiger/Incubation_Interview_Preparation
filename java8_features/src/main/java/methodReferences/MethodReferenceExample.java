package methodReferences;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceExample {

    private static void getMessage(String message) {
        System.out.println("Static Method: " + message);
    }

    private void getText(String message) {
        System.out.println("Instance Method: " + message);
    }

    public static void main(String[] args) {

        // 1. Static Method Reference
        Consumer<String> consumer1 = MethodReferenceExample::getMessage;
        consumer1.accept("Hello");

        // 2. Instance Method Reference
        MethodReferenceExample referenceExample = new MethodReferenceExample();
        Consumer<String> consumer2 = referenceExample::getText;
        consumer2.accept("World");

        // 3. Instance Method of Arbitrary Object
        Function<String, Integer> function = String::length;
        int result = function.apply("Niraj");
        System.out.println(result);


    }
}
