package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamsPractice {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 45000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "Finance", 55000),
                new Employee("Eve", "HR", 35000)
        );

        //Filter employees whose salary is greater than $50,000.
        List<Employee> employees1 = employees.stream()
                .filter(e -> e.getSalary() > 50000).toList();
        employees1.forEach(System.out::println);

        System.out.println("********************");

        //Group employees by department.
        Map<String, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach((department, employee) ->
        {
            System.out.println("Department: " + department);
            employee.stream().map(Employee::getName).forEach(System.out::println);
        });

        System.out.println("********************");

        //Find the average salary in each department. (Use Collectors.averagingDouble())
        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        averageSalaryByDepartment.forEach((department, avgSalary) -> {
            System.out.println("Average Salary of " + department + " department is " + avgSalary);

        });

    }
}
