package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicateExample = (a, b) -> (a + b) > 10;

        System.out.println(biPredicateExample.test(5, 6));
        System.out.println(biPredicateExample.test(5, 5));
    }
}
