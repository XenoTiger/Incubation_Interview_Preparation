package Collections.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000.0),
                new Employee("Bob", "HR", 45000.0),
                new Employee("Charlie", "IT", 70000.0),
                new Employee("David", "Finance", 55000.0),
                new Employee("Eve", "HR", 35000.0)
        );

        Collections.sort(employees);
        employees.forEach(System.out::println);
    }
}
