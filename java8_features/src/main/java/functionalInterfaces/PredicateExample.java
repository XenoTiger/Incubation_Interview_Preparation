package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> (x %2==0);
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));
    }
}
