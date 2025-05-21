package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + " " + s2;

        System.out.println(biFunction.apply("Hello", "World"));
    }
}
