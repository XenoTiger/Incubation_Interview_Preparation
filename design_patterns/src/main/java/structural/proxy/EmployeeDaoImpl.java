package structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee employee) {
        System.out.println("Created a new row in Employee table");
    }

    @Override
    public void delete(String client, String name) {
        System.out.println("Deleted row with name : "+ name);
    }

    @Override
    public Employee get(String client, String name) {
        System.out.println("Fetching data from DB");
        return new Employee();
    }
}
