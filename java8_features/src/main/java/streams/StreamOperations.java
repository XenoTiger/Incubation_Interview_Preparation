package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Putin", "Biden", "Modi", "Trump", "Ronaldo"
        );
        //max and min
        String min = names.stream().min(Comparator.comparing(String::length)).get();
        System.out.println("Minimum length String is: " + min);

        String max = names.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("Maximum length String is: " + max);

        //sum of integers
        List<Integer> integerList = List.of(2, 5, 3, 1, 2, 6, 1);
        int sum1 = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of integers: " + sum1);
        int sum2 = integerList.stream().reduce(0, Integer::sum);
        System.out.println("Sum of integers using reduce(): " + sum1);

        //remove duplicates
        List<Integer> removeDuplicates = integerList.stream().distinct().toList();
        System.out.println("Removing duplicates: " + removeDuplicates);
        List<Integer> removeDuplicatesAndSort = integerList.stream().sorted().distinct().toList();
        System.out.println("Removing duplicates and sorting: " + removeDuplicatesAndSort);

        //frequency of each element of a string
        String str = "JavaIncubationProgram";
        String[] sarr = str.split("");
        Map<String, Long> frequencyMap = Arrays.stream(sarr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of each element: " + frequencyMap);

        //sorting
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);  //immutable
        List<Double> sortList = decimalList.stream().sorted().toList();
        System.out.println("Sorted list: " + sortList);
        List<Double> reverseList = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reverse list: " + reverseList);

        //limit
        List<Integer> integers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> maxNumbers = integers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("Three max numbers from list are: " + maxNumbers);
        List<Integer> minNumbers = integers.stream().sorted().limit(3).toList();
        System.out.println("Three min numbers from list are: " + minNumbers);

        //skip
        int secondLargestElement = integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second largest element in list is: " + secondLargestElement);

        //map, flatMap, peek()
        List<String> namesWithTheirLength = names.stream().map(String::toLowerCase).toList();
        System.out.println("Names in lowercase: " + namesWithTheirLength);
        List<Integer> squares = integers.stream().map(n -> n * n).toList();
        System.out.println("Squares of numbers are: " + squares);

        //flatMap
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5), Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println("Flattened List: " + flattenedList);
        List<String> flattenedCharList = names.stream().flatMap(word -> Arrays.stream(word.split(""))).toList();
        System.out.println("Flattened Character List: " + flattenedCharList);
        List<Integer> evenNumberList = listOfLists.stream().flatMap(List::stream).filter(n -> n % 2 == 0).toList();
        System.out.println("Even Number List: " + evenNumberList);

        //parallelStream
        List<Integer> largeSetOfData = IntStream.range(1, 1_000_000_00).boxed().toList();
        long startTime = System.currentTimeMillis();
        long count = largeSetOfData.parallelStream().filter(n -> n % 2 == 0).count();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Even number counts in large set of data: " + count);
        System.out.println("Time taken by parallelStream: " + duration/1000.0 + " seconds");

        long startTime1 = System.currentTimeMillis();
        long count1 = largeSetOfData.stream().filter(n -> n % 2 == 0).count();
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;
        System.out.println("Even number counts in large set of data: " + count1);
        System.out.println("Time taken by stream: " + duration1/1000.0 + " seconds");

        //peek(Generally used for debugging the stream ops)
        List<Integer> oddNumbers = integers.stream().filter(n -> n % 2 !=0)
                .peek(result -> System.out.println("Filtered Result: " + result)).toList();
        System.out.println("Odd Numbers: " + oddNumbers);


    }
}
