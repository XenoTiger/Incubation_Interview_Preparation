package Collections.sorting;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private String department;
    private Double salary;

    public Employee(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        if (Objects.equals(salary, e.getSalary()))
            return 0;
        else if (salary < e.getSalary())
            return 1;
        else
            return -1;
    }
}
