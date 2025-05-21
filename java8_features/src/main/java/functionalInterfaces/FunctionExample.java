package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Integer> function = number -> number * number;

        System.out.println("Square of 4 is " + function.apply(4));
    }
}
