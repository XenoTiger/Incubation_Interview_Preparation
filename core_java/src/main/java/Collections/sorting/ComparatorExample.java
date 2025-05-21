package Collections.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000.0),
                new Employee("Charlie", "IT", 70000.0),
                new Employee("David", "Finance", 55000.0),
                new Employee("Bob", "HR", 45000.0),
                new Employee("Eve", "HR", 35000.0)
        );

        employees.sort(new NameComparator());
        employees.forEach(System.out::println);

        System.out.println("*****************");

        //USing lambda
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        System.out.println("*****************");

        employees.sort(Comparator.comparing(Employee::getDepartment));
        employees.forEach(System.out::println);

        System.out.println("*****************");

        //chaining
        employees.sort(Comparator.comparing(Employee::getDepartment)
                .thenComparingDouble(Employee::getSalary));
        employees.forEach(System.out::println);

    }
}
