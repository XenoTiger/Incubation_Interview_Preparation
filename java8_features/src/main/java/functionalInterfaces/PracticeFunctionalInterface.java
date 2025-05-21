package functionalInterfaces;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface DataTransformer<T, R> {
    R transform(T input);
}

public class PracticeFunctionalInterface {
    public static void main(String[] args) {
        DataTransformer<String, String> uppercaseTransformer  = String::toUpperCase;
        System.out.println(uppercaseTransformer .transform("niraj"));

        DataTransformer<Integer, Integer> dataTransformer = (a) -> a * a;
        System.out.println(dataTransformer.transform(4));

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = integerList.stream().map(dataTransformer::transform)
                .toList();
        squares.forEach(s -> System.out.print(s + " "));

        List<String> stringList = Arrays.asList("niraj", "virat", "ronaldo");
        List<String> transformedStrings = stringList.stream().map(uppercaseTransformer ::transform)
                .toList();
        transformedStrings.forEach(s -> System.out.print(s + " "));
    }


}
